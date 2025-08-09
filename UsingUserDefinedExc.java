package iptTrialClass2;

public class UsingUserDefinedExc {
	// Using userDefinedException 
	
	public static void verifyAge(int age) throws UserDefinedException {
		if(age <= 20) {
			throw new UserDefinedException("Invalid age to get married");
		}
	}
	public static void main(String[] args) throws UserDefinedException {
		
		verifyAge(17);
	
	}

}
