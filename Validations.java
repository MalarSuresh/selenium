package org.restAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

// This class demonstrates how to validate API responses using RestAssured and TestNG
public class Validations {
	@Test
	public void valid() {

		// Validate the response body using Hamcrest matchers
		given()
			.header("x-api-key", "reqres-free-v1")
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.header("Content-Type", "application/json; charset=utf-8")
			.body("data[2].email", equalTo("tobias.funke@reqres.in"));
	}
	@Test
	public void getRequest() {
			// Validate the response status code-more effective way
		Response res=given()
				.header("x-api-key", "reqres-free-v1")
			.when()
				.get("https://reqres.in/api/users?page=2");
			Assert.assertEquals(res.getStatusCode(), 200);
	}

}
