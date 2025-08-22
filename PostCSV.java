package org.restAssured;
import static io.restassured.RestAssured.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
public class PostCSV {

		// This class is intended to handle CSV file operations for POST requests.
	@Test
	public void postRequestFromCSV() throws IOException, CsvException {
		// Example of how to read a CSV file and post data	
		//code to read CSV file would go here
			String csvFilePath = "C://Users//malar//OneDrive//Desktop//files.csv"; // Update with your CSV file path"
			  CSVReader reader = new CSVReader(new FileReader(csvFilePath)) ;
			  reader.readNext();

	                List<String[]> records = reader.readAll();
	                // Process the records as needed
	                for (String[] record : records) {
	                    System.out.println("CSV Record: " + String.join(", ", record));
	                }
		given()
		.header("x-api-key", "reqres-free-v1")
			.body(reader) // Assuming the first record is to be posted
			.when()
			.post("https://reqres.in/api/users")
			.then()
			.statusCode(201)
			.log().all();
		
	}
		
}
