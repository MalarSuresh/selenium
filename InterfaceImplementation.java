package com.javabasics;

public class InterfaceImplementation implements InterfaceExample{

	@Override
	public void interfaceMethod1() {
		System.out.println("interfaceMethod1");
	}

	@Override
	public void interfaceMethod2() {
		System.out.println("interfaceMethod2");
		
	}
public static void main(String[] args) {
	InterfaceImplementation ii=new InterfaceImplementation();
	ii.interfaceMethod1();
	ii.interfaceMethod2();
	InterfaceExample.normalMethod();
}
}
