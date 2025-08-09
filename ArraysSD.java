package com.javabasics;
import java.util.Arrays;
public class ArraysSD {
	private void stringMethod() {
		String[] names=new String[5];
		names[0]="Anu";
		names[2]="Ajay";
		names[3]="Abi";
		names[4]="Arya";
		System.out.println(names[4]+" and "+names[2]+ " are friends.");
		System.out.println("__________________");
	}
	private void intArrayMethod() {
		int[] marks= {90,85,80,75,100};
		for(int a:marks) {
			System.out.println(a);
		}	System.out.println("__________________");
	}
	private void method3() {
		String[] subjects=new String[5];
		subjects[0]="English";
		subjects[1]="Mathematics";
		subjects[2]="Science";
		subjects[3]="Tamil";
		subjects[4]="History";
		for(int i=0;i<subjects.length;i++) {
			System.out.println(subjects[i]);
		}	System.out.println("__________________");
		//To print array value in reverse order
		System.out.println("To print array value in reverse order");
		for(int i=(subjects.length-1);i>=0;i--) {
			System.out.println(subjects[i]);
		}	System.out.println("__________________");
	}
	private void method4() {
		int[] rollNo= {101,102,103,104,105};
		System.out.println(Arrays.toString(rollNo));
		System.out.println("__________________");
	}
	public static void main(String[] args) {
		ArraysSD arr=new ArraysSD(); 
		arr.stringMethod();
		arr.intArrayMethod(); 
		arr.method3(); 
		arr.method4();
	}
}
