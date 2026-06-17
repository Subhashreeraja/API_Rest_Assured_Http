package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateMethod {

    @Test
    public void updateMethod() {

        Map<String, Object> payload = new HashMap<>();

        payload.put("id", "7");
        payload.put("name", "Kaaviya");
        payload.put("email", "kaaviya@gmail.com");
        payload.put("company", "Meta");

        RestAssured
            .given()
                .contentType("application/json")
                .body(payload)

            .when()
                .put("http://localhost:3000/trainees/7")

            .then()
                .statusCode(200)
                .log().all();
    }
}