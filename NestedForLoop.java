package com.javabasics;

public class NestedForLoop {

	public static void main(String[] args) {
		int i;
		int j;
		String value="*";
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println(value);
			value=value+"*";
		}
	System.out.println("===========================================");
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}for(int k=0;k<=5-i;k++) {
			System.out.print("*");
		}System.out.println("");
	}
	System.out.println("===========================================");
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	System.out.println("===========================================");
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println(" ");
	}
	System.out.println("===========================================");
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++) {
			System.out.print(i);
			}System.out.println(" ");
		}
	System.out.println("===========================================");
		for(i=10;i>=1;i--) {
			System.out.println(i);
		}
	}
}
