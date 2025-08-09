package com.TestPackage;

public class Pgm2Constructor {

	public Pgm2Constructor() {
		this("AnyStringValue");
		System.out.println("This is a default constructor");
	}
	public Pgm2Constructor(String name) {
		System.out.println("This is parameterized constructor");
	}

	public static void main(String[] args) {
		new Pgm2Constructor();
	}
}
