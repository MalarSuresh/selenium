package com.TestPackage;

import java.util.Arrays;

public class Pgm5Array {
	public static void main(String[] args) {
		String name[]= {"Malar","Anu","Abi"};
		for(String a:name) {
			System.out.println(a);
		}
		int a[]= {1,2,3,4,5};
		for(int k=0;k<=(a.length-1);k++)
		{
			System.out.println(a[k]);
		}
		System.out.println(Arrays.toString(name));
		System.out.println(a[2]);

	}
}
