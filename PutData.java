package org.restAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

// Update request to update the existing data
public class PutData {
	@Test	
	public void putRequest() {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "Jackson");
		map.put("job", "Developer");
		
		
		given()
			.header("x-api-key", "reqres-free-v1")
			.body(map)
		.when()
			.put("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.log().all();
	}
}
