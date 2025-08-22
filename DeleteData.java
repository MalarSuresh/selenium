package org.restAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
// Delete Request
public class DeleteData {


		@Test
		public void deleteRequest() {
			given()
				.header("x-api-key", "reqres-free-v1")
			.when()
				.delete("https://reqres.in/api/users/2")
			.then()
				.statusCode(204)
				.log().all();
		}

}
	
