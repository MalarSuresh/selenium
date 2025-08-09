package com.TestPackage;

public class Pgm6StringFn {

	public static void main(String[] args) {
		String wish="Happy New Year 2024";
		System.out.println(wish.length());
		System.out.println(wish.contains("2024"));
		System.out.println(wish.concat("!!! Have fun!!!"));
		System.out.println(wish.replace("New","NEW"));
		System.out.println(wish.indexOf('N'));
		System.out.println(wish.lastIndexOf('a'));
		System.out.println(wish.startsWith("H"));
		System.out.println(wish.endsWith("2023"));
		System.out.println(wish.substring(6,9));
		System.out.println(wish.toLowerCase());
		System.out.println(wish.toUpperCase());
		System.out.println(wish.equals(wish));
	}
}
