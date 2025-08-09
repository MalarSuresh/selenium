package com.TestPackage;

public class Pgm4Exception {

	public void ExceptionMethod() {
		int a[]=new int[5];
		try {
			System.out.println(a[5]);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void ExceptionMethod2() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("InterruptedException");
	}
	public static void main(String[] args) throws InterruptedException {
		Pgm4Exception ex=new Pgm4Exception();
		ex.ExceptionMethod();
		ex.ExceptionMethod2();
	}
}
