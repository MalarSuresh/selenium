package com.javabasics;

public class StringExamples {
	
	
	private void literalString() {
		String name="Selenium";
		System.out.println("This is a literal string declaration and it is immutable "+name);
	}
	private void nonLiteralString() {
		String name=new String("JAVA");
		System.out.println("This is a nonliteral string declaration and it is mutable "+name);
	}
	private void StringBufferEx() {
		StringBuffer language = new StringBuffer("Python"); 
		System.out.println("This is a String buffer example "+language);
	}


	public static void main(String[] args) {
		StringExamples stEx=new StringExamples();
		stEx.literalString();
		stEx.nonLiteralString();
		stEx.StringBufferEx();
	}
	
}
