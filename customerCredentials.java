package com.bankDetails;

public class customerCredentials extends CustomerData {
	@Override
	public void customerName() {
		System.out.println("Child class overriding parent class");
		super.customerName();
	}
	@Override
	public void customerName(String name, int ID) {
		System.out.println("Child class name and Id :"+name+", "+ID);
		super.customerName(name, ID);
	}
	public void customerUsername() {
		System.out.println("Child class -prints customer username");
	}
	
	public static void main(String[] args) {
		customerCredentials cc=new customerCredentials();
		cc.customerName();
		cc.customerName("Vish", 05);
		cc.customerName("Laksh", 10080800078l);
	}
	
	
}
