package com.gorest.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Vishnu Ahir
 */
public class TestBase {

    public int id = 1;

    @BeforeMethod
    public void inIT(){
        RestAssured.baseURI="https://gorest.co.in";
        RestAssured.basePath="/public/v2";
    }

}