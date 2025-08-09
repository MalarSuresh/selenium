package com.javabasics;
import java.util.Scanner;
public class TwoDiArray {

	public static void main(String[] args) {
		int[][] twoD= {{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0;i<twoD.length;i++) {
			for(int j=0;j<twoD[i].length;j++) {
			System.out.print(twoD[i][j]);
		}System.out.println(" ");
	}System.out.println("---------------");
		Scanner values=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int m=values.nextInt();
		for(int i=m;i<twoD.length;i++) {
			for(int j=0;j<twoD[i].length;j++) {
			System.out.print(twoD[i][j]);
		}System.out.println(" ");
	}System.out.println("--------Linear Array-------");
		String names[][]= {{"Anu","Adhav","Abi","Anvi"},{"Beena"," ","Barbie"},{"Cathrine","chandru"}};
		System.out.println("Length of the Array: "+names.length);
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
			System.out.print(names[i][j]+",");
		}System.out.println(" ");
	}System.out.println("------Non linear array---------");
		System.out.println(" ");
		String names1[][]=new String[4][4];
		names1[0][0]= "Deepti";
		names1[0][1]="Dhruv";
		names1[0][2]="Elena";
		names1[0][3]="Eman";
		names1[1][0]="Farina";
		names1[2][3]="Faizal";
		names1[3][3]="Farah";
		for(int i=0;i<names1.length;i++) {
			for(int j=0;j<names1[i].length;j++) {
			System.out.print(names1[i][j]+",");
		}System.out.println(" ");
	}
		values.close();
	}
}
