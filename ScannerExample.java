package com.javabasics;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("We are going to compare 2 numbers");		
		System.out.println("Enter any whole number: ");
		int number1=sc.nextInt();
		System.out.println("Enter any other whole number: ");
		int number2=sc.nextInt();
		if (number1<number2) {
			System.out.println(number1+" is the smallest. ");
		}else {
			System.out.println(number2+" is the smallest");
		}
		System.out.println("Enter any decimal number: ");
		float number3=sc.nextFloat();
		System.out.println("Enter any char(Y/N): ");
		String character=sc.next();
		System.out.println(number3+" "+character);
		sc.close();
	}
}
