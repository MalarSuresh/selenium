package org.restAssured;
import static io.restassured.RestAssured.given;
import java.util.HashMap;

import org.testng.annotations.Test;

//this is post method from rest assured utils file
public class PostUtils {
	@Test
	public void postUt() {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", RestUtils.getName());
		map.put("job", RestUtils.getJob());
		
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
