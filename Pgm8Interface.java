package com.TestPackage;

public class Pgm8Interface implements Pgm8InterfaceEx {
	@Override
	public void customerNames() {
		System.out.println("Customer name");
	}
	@Override
	public void customerId() {
		System.out.println("CustomerId");
	}
	public static void main(String[] args) {
		Pgm8Interface in=new Pgm8Interface();
		in.customerNames();
		in.customerId();
	}
}
