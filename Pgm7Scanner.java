package com.TestPackage;
import java.util.Scanner;
public class Pgm7Scanner {
	public void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name within 10 letters:");
		String name=sc.nextLine();
		System.out.println("The length of the entered name is: "+name.length());
		System.out.println("Enter any integer value: ");
		int a=sc.nextInt();
		System.out.println("Enter another integer value: ");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("The value first entered is big. ");
		}else {
			System.out.println("The value second entered is big. ");
		}sc.close();
	}
	public static void main(String[] args) {
		Pgm7Scanner pgm=new Pgm7Scanner();
		pgm.method2();
}
}
