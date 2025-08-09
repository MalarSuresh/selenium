package com.javabasics;

public class VariablesTask {
	static String name;	
	static byte age;
	static String mailID;
	static String username; 	//static variables
	int plotNumber;
	String streetName;
	String addressLine1="abc avenue";
	String addressLine2="Chennai";
	int pincode=600077;//class variables		
	private static void basicDetails() {		//static method
		int ifsc=1234;
		mailID="anu@gmail.com";		
		username="Anu*123";	
		System.out.println("ifsc:"+ifsc+",mailid:"+mailID+",Username: "+username);
	}
	private static void changeBasicDetails() {	//static method
		String branch="Kolathur";		//local variable
		mailID="ria@gmail.com";				
		username="ria#987";		//assigning different values for static variables
		System.out.println("Branch: "+branch+",mailid:"+mailID+",Username: "+username);
	}
	private void address() {	
	String landmark="watertank";
	int mobileNumber=1234567890;
	System.out.println("Local variables: "+landmark+", "+mobileNumber);
	System.out.println("Default values: "+plotNumber+", "+streetName);	//print default values
	System.out.println("initialized values: "+addressLine1+" , "+addressLine2+", "+pincode);

	plotNumber=25;
	streetName="Kambar street";		//initialize values for declared variables
	System.out.println("initialized default values: "+plotNumber+ " "+streetName+" "+addressLine1+" , "+addressLine2+", "+pincode);
	}
	
	public static void main(String[] args) {
		basicDetails();
		changeBasicDetails();
		VariablesTask vt=new VariablesTask();
		vt.address();
	}
}
