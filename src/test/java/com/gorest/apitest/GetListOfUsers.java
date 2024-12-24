package com.gorest.apitest;

import com.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Vishnu Ahir
 */
public class GetListOfUsers extends TestBase {

    @Test
    public void getListOfUser() {

        Response response = given().log().all()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

        //Verify Total records are 10
        Assert.assertEquals(response.jsonPath().getList("data").size(), 10);

    }
}