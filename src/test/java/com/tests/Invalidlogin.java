package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Invalidlogin {
	@Test
	public void invalidlogin() {
		Map<String,Object> payload=new HashMap<>();
		payload.put("username","wrong");
		payload.put("password","wrong");
		Response response=RestAssured.given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.post("http://localhost:5000/login");
		System.out.println("Invalid Login:"+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(),401);
	}

}
