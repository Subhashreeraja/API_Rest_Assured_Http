package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Logintest {
	@Test
	public void logintest() {
		Map<String,Object> payload=new HashMap<>();
		payload.put("username","admin");
		payload.put("password","admin123");
		Response response=RestAssured.given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.post("http://localhost:5000/login");
		System.out.println("Login Successfully:"+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(),200);
		
		
	}

}
