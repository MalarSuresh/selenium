package org.restAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

//Get Request
public class GetData {

	
	@Test
	public void getRequest() {
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200).log().all();
	}


}
