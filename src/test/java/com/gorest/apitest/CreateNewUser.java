package com.gorest.apitest;

import com.gorest.model.UserPojo;
import com.gorest.testbase.TestBase;
import com.gorest.utils.TestUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateNewUser extends TestBase {

    @Test
    public void createNewEmployee() {

        UserPojo userPojo = new UserPojo();
        userPojo.setName("child test");
        userPojo.setGender("male");
        userPojo.setEmail("childtest"+ TestUtils.getRandomValue() +"@test.com");
        userPojo.setStatus("active");

        Response response = given()
                .header("Accept","application/json")
                .header("Content-type","application/json")
                .header("Authorization","Bearer e832a705655493c7e143306a74ee223819a9c96b6376f7603bcebd4887434d6e")
                .body(userPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();
    }

}
