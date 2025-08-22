package org.restAssured;
import org.apache.commons.lang3.RandomStringUtils;

// Utility class for generating random names and job titles
public class RestUtils {

		// Method to generate a random name
	public static String getName() {
		String generatedString = RandomStringUtils.randomAlphabetic(2);
		return ("Chikki" + generatedString);
	}

	// Method to generate a random job title
	public static String getJob() {
		String generatedString = RandomStringUtils.randomAlphabetic(2);
		return ("QA" + generatedString);
	}
}
