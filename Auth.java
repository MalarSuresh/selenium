package org.restAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
//Authentication types: Basic, Digestive, OAuth1, Bearer Token
public class Auth {
	@Test
	public void basicAuth() {
			given()
			.auth().basic("postman", "password")
			.when()
			.get("https://postman-echo.com/basic-auth")
			.then()
			.statusCode(200)
			.body("authenticated",equalTo(true))
			.log().all();
		
	}
	@Test
	public void digestiveAuth() {
		given()
		.auth().digest("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().all();
	}
	
	
	
	//public void oauth1Auth() {}
	
	
	
	public void bearerTokenAuth() {
		String bearerToken="";
		//generating bearer token using postman and passing it here
		//https://www.postman.com/postman
		//https://learning.postman.com/docs/sending-requests/authorization/#bearer-token
		given()
		.header("Authorization","Bearer "+bearerToken)
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().all();
		
	}
		
		
		
}
