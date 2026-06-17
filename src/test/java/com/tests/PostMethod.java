package com.tests;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class PostMethod {
	@Test
	public void post() {
		Map<String,Object> payload=new HashMap<>();
		payload.put("name", "Kowsikaa");
		payload.put("email", "Kowsikaa@gmail.com");
		payload.put("company", "Google");
		Response response=RestAssured
				.given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.post("http://localhost:3000/trainees");
		System.out.println("Data Created:"+response.getStatusCode());
		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(),201);
		Assert.assertEquals(response.jsonPath().getString("name"),"Kowsikaa");
		
	}
	
	

}
