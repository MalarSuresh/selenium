package RestPJT;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class RestAssuredPJT {
	@Test
	public void getUser() {
		Response response = RestAssured
		.given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.log()
		.all()
		.extract()
		.response();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Test
	public void createUser() {
		Response response = RestAssured
		.given()
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.log()
		.all()
		.extract()
		.response();
		Assert.assertEquals(response.getStatusCode(), 201);
	}
	
	@Test
	public void updateUser() {
		 Response response = RestAssured
				 .given()
				 .body("{\r\n"
				 		+ "    \"name\": \"morpheus\",\r\n"
				 		+ "    \"job\": \"resident\"\r\n"
				 		+ "}")
				 .when()
				 .put("https://reqres.in/api/users/2")
				 .then()
				 .log()
				 .all()
				 .extract()
				 .response();
		 Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void deleteUser() {
		Response response = RestAssured
		.given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.log()
		.all()
		.extract()
		.response();
		Assert.assertEquals(response.getStatusCode(), 204);
		
	}
	
}
