package com.javabasics;

public class variables{
	int i=10;				//local variable
	static int k=30;		//static variable
	static int j=5;		//static variable can be used anywhere in the class
	
	public static void staticMethod() {
		int j=20;			
	System.out.println("Value of static variable: "+k);	//static variable is used only inside static method
	System.out.println("Can i print j value here "+j);	//instant var can be used only inside that method
	}
	
	public void userMethod(){
		System.out.println("I can use the local variable here " +i);
		int y;
		for(y=4;y<=8;y++)
			System.out.println(y++);
		
		int m=15;int n=20;
		String p=(m<n)? "m is smaller":((n>y)?"yes":"y is small"); //ternary op using condition 
		System.out.println(p);
		}
	public static void main(String[] canBeAnyName) {
		staticMethod();			//static method is called without obj
		variables var=new variables();
		var.userMethod();
		System.out.println("Value of J "+j);
		//		6 +	 7  + 7
		int z=++j + ++j + j++;		//difference b/n pre and postfix: pre value is already incremented,post value is incremented but used in next place
		System.out.println(z);
		int a = 0;
		System.out.println(a);
		
	}

}
