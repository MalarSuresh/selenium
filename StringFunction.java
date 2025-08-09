package com.javabasics;
public class StringFunction {
	String quote1="Betty bought butter but the butter was bitter";
	String quote2="so Betty bought better butter to make the bitter butter better.";	
	String quote3=quote1.toUpperCase();										//toUppercase
	String quote4=quote1.toLowerCase();										//toUppercase

	private void stringValues() {
		System.out.println("Quote1: "+quote1);	
		System.out.println("Quote2: "+quote2);	
		System.out.println("Quote3: "+quote3);	
		System.out.println("Quote4: "+quote4);
		System.out.println("-----------------------------------------");
	}
	private void stringFunctions1() {	
		System.out.println("Length(): "+quote1.length()+" " +quote2.length());	//length
		System.out.println("equals: "+quote1.equals(quote2));					//equals				
		System.out.println("equals: "+quote1.equals(quote3));				//equals case sensitive				
		System.out.println("equalsIgnoreCase: "+quote1.equalsIgnoreCase(quote3));//equalsIgnoreCase	
		System.out.println("Starts with Betty: "+quote1.startsWith("Betty"));	//startsWith
		System.out.println("Starts with Betty: "+quote1.startsWith("betty"));	//startsWith case sensitive
		System.out.println("Ends with better: "+quote2.endsWith("better."));	//endsWith
		System.out.println("-----------------------------------------");
	}	
	private void stringFunctions2() {
		System.out.println("Contains: "+quote3.contains("BUT"));			//contains
		System.out.println("Index of: "+quote1.indexOf('b'));				//IndexOf
		System.out.println("Last Index of: "+quote1.lastIndexOf('b'));		//lastIndexOf
		System.out.println("Character at the position 4 :"+quote1.charAt(4));	//charAt()
		System.out.println("Replace better with butter : "+quote2.replace("better", "butter"));//replace
		System.out.println("-----------------------------------------");
	}
	private void stringFunctions3() {
		String wordToTrim="            k";
		System.out.println(wordToTrim+","+wordToTrim.trim());	//trim
		System.out.println(quote1.concat(quote2));				//concat
		System.out.println(quote1.substring(13));				//substring
		System.out.println(quote1.substring(13,30));
		System.out.println(wordToTrim.isEmpty()); 				//isEmpty
		System.out.println("-----------------------------------------");
	}
	private void splitFunction() {
		String split[]=quote1.split(" ");							//split	
		for(String j:split) {
			System.out.println(j);
			}
		System.out.println("-----------Print Array in reverse-----------");
		for(int i=(split.length-1);i>0;i--) {
			System.out.println(split[i]);
			}
	}
	public static void main(String[] args) {
		StringFunction stFn=new StringFunction();
		stFn.stringValues();
		stFn.stringFunctions1();
		stFn.stringFunctions2();
		stFn.stringFunctions3();
		stFn.splitFunction();



		}		
}
