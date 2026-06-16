package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteMethod {
	@Test
	public void deletedata() {
		Response response=RestAssured
				.given()
				.when()
				.delete("http://localhost:3000/trainees/8");
		System.out.println("Data Deleted Successfully:"+response.getStatusCode());
		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(),200);
	}

}
