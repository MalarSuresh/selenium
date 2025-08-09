package com.javabasics;

public class Switch{

	public static void main(String[] args) {
		for(int i=1;i<=12;i++){
			if(i==7){		
			continue;
			}
			else if(i==10) {
				break;		
			}
			System.out.println(i);		
	}
		int j=15;
		switch(j) {
	
		case 10:
			System.out.println("no");
		case 15:
			System.out.println("yes");
			break;
		case 17:
			System.out.println("no");
		
		}
		
		}
	}
