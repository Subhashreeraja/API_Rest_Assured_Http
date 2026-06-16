package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OptionsMethod {
	@Test
	public void optionsmethod() {
		Response response=RestAssured
				.given()
				.when()
				.options("http://localhost:3000/trainees");
		System.out.println("Option Method:"+response.getStatusCode());
		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(),204);
	}

}
