package com.gorest.apitest;

import com.gorest.model.UserPojo;
import com.gorest.testbase.TestBase;
import com.gorest.utils.TestUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateUser extends TestBase {

    @Test
    public void updateUserDetails() {

        UserPojo userPojo = new UserPojo();
        userPojo.setName("child test");
        userPojo.setEmail("childtest"+ TestUtils.getRandomValue() +"@test.com");
        userPojo.setStatus("active");
        userPojo.setGender("male");

        Response response = given().log().all()
                .header("Accept","application/json")
                .header("Content-type","application/json")
                .header("Authorization","Bearer e832a705655493c7e143306a74ee223819a9c96b6376f7603bcebd4887434d6e")
                .pathParam("id",7599484)
                .when()
                .body(userPojo)
                .patch("/users/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
