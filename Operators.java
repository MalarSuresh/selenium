package com.javabasics;
public class Operators {	
	public static void main(String[] args) {int num1=200;int num2=10;
//Arithmetic increment,decrement operators
		System.out.println("Number1+Number2= "+(num1+num2)); System.out.println("Number1+Number2= "+(num1-num2));
		System.out.println("Number1*Number2= "+(num1*num2)); System.out.println("Number1/Number2= "+(num1/num2));
		System.out.println("Number1%Number2= "+(num1%num2));
		System.out.println("Increment of number1 "+(++num1));
		System.out.println("Decrement of number2 "+(--num2));
		System.out.println("_____________________________________________");
//Assignment operator
		int num3=30;int num4;
		num4=num3;System.out.println(num4);		num4+=num3;System.out.println(num4);
		num4-=num3;System.out.println(num4);	num4*=num3;System.out.println(num4);
		num4/=num3;System.out.println(num4);	num4%=num3;System.out.println(num4);
		System.out.println("_____________________________________________");
		num4=50;
//Logical operator
		System.out.println((num4>num3)&&(num1>num2)); 	System.out.println((num4>num3)&&(num1<num2));
		System.out.println((num4<num3)&&(num1>num2));	System.out.println((num4<num3)&&(num1<num2));
		System.out.println((num4>num3)||(num1>num2));	System.out.println((num4>num3)||(num1<num2));
		System.out.println((num4<num3)||(num1>num2));	System.out.println((num4<num3)||(num1<num2));
		System.out.println(!(num4==50));
		System.out.println("_____________________________________________");
//Relational/comparison operator
		System.out.println(num3==num4);			System.out.println(num3!=num4);
		System.out.println(num3<num4);			System.out.println(num3>num4);
		System.out.println(num3<=num4);			System.out.println(num3>=num4);
		System.out.println("_____________________________________________");
//Ternary operator
		String result=(num1<num2)? "yes":"no";
		System.out.println(result);
		System.out.println("_____________________________________________");
	}
}
