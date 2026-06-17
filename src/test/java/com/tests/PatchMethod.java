package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PatchMethod {
	@Test
	public void modifyMethod() {
		Map<String,Object> payload=new HashMap<>();
		payload.put("company", "CTS");
		Response response=RestAssured
				.given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.patch("http://localhost:3000/trainees/10");
		System.out.println("Updated Successfully:"+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.jsonPath().getString("name"),"vithya");
		
		
		
	}
	

}
