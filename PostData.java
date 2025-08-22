package org.restAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;
//Post Request
public class PostData {

	@Test
	public void postRequest() {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "John");
		map.put("job", "Developer");
		
		given()
			.header("x-api-key", "reqres-free-v1")
			.body(map)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.log().all();
	}
	
}
