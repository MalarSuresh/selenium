package com.TestPackage;

import java.util.Scanner;

public class Pgm3InputFromUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer value: ");
		int a=sc.nextInt();
		System.out.println("The value user entered is: "+a);
		sc.close();
	}
}
