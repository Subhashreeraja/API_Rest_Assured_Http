package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getmethod {
	 @Test
	  public void getUserTest() {
		  Response response=RestAssured
				  .given()
				  .when()
				  .get("http://localhost:3000/trainees/6");
		  System.out.println("Status Code:"+response.getStatusCode());
		  response.prettyPrint();
		  Assert.assertEquals(response.getStatusCode(),200);
		  String name=response.jsonPath().getString("name");
		  Assert.assertEquals(name,"Subha");
	  }


}
