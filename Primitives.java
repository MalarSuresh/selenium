package com.javabasics;
import java.util.Arrays;
//using 8 primitive and 2 non-primitive datatypes
public class Primitives {
	public static void main(String[] args) {
		byte rollNo=12;
		short age=28;
		int pincode=600067;
		long mobileNumber=9123456789l;
		float percent=88.2f;
		double password=2345.342;
		char plotNo='#';
		boolean female=true;
		String name="Anu";
		String email="anu@gmail.com";
		String address="chennai";
		int[] marks= {79,89,98,87,88};
			System.out.println("My name is "+name+".My roll number is "+rollNo+". I'm "+age+
				" years old. My contact no. is "+mobileNumber+".");
			System.out.print("Send a Mail to "+email );
			System.out.println(".  An example for password is "+password);
			System.out.println("Location "+address+" "+plotNo+" ,"+pincode);
			System.out.println("Percentage: "+percent+" % with Marks "+Arrays.toString(marks));
			System.out.print("Just printing boolean value '"+female+"'");
		}
}
