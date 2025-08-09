package com.javabasics;
public class ExtendAbstractClass extends AbstractClass {
	@Override
	public void abstractMethod1() {
		System.out.println("This is an Abstract method1");
	}
	@Override
	public void abstractMethod2() {
		System.out.println("This is an Abstract method2");
	}
	public static void main(String[] args) {
		AbstractClass.normalMethod();
		ExtendAbstractClass ea=new ExtendAbstractClass();
		ea.abstractMethod1();
		ea.abstractMethod2();
	}
}
