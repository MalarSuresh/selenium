package com.javabasics;

import java.util.Scanner;

public class ExceptionHandlingEx {
	
	public void arithmeticExceptionEx() {
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("It has Arithmetic Exception");
		}
	}
	public void interruptedException() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int q=sc.nextInt();
		if(q==0) {
			Thread.sleep(5000);
		}
		System.out.println("Interrupted Exception");
		sc.close();
	}
	public void ArrayIndexOutOfBoundEXC() {
		String[] name= {"Abi","Arav","Ani","Asish"};
		try {
		System.out.println(name[4]);
		}catch(Exception e)
		{
			System.out.println("Array Index OutOfBound Exception occured");
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ExceptionHandlingEx exc=new ExceptionHandlingEx();
		exc.arithmeticExceptionEx();
		exc.ArrayIndexOutOfBoundEXC();
		//exc.interruptedException();

	}
}

