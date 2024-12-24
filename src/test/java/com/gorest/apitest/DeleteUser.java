package com.gorest.apitest;

import com.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUser extends TestBase {

    @Test
    public void deleteUser() {

        Response response = given().log().all()
                .header("Accept","application/json")
                .header("Content-type","application/json")
                .header("Authorization","Bearer e832a705655493c7e143306a74ee223819a9c96b6376f7603bcebd4887434d6e")
                .pathParam("id",7599485)
                .when()
                .delete("/users/{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }
}
