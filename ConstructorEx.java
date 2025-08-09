package com.javabasics;

public class ConstructorEx {
	public ConstructorEx() {
		this(600045);
		System.out.println("Landmark: behind postoffice ");
	}
	public ConstructorEx(int s) {
		this(987654321l);
		System.out.println("Pincode: "+s);
	}
	public ConstructorEx(long l) {
		this(21,"2nd","Redhills");
		System.out.println("Phone no.: "+l);
	}	
	public ConstructorEx(int a,String s,String d) {
		this("Suresh kumar");
		System.out.println("No.: "+a+","+s+" street,"+d+" ,Chennai");
	}	
	public ConstructorEx(String q) {
		this.ConstructorExp();
		System.out.println("W/o :"+q);
	}
	public void ConstructorExp() {
		System.out.println("Name: Malarvizhi");  
	}

	public static void main(String[] args) {
		ConstructorEx ce=new ConstructorEx();
		ce.ConstructorExp();
		System.out.println("-------------------------------------");
		new ConstructorEx("SK");//constructor can be called like this too
	}
}
/*Class name and constructor names are same
 * Constructor has no return type
 * Default constructor will be called when object is created
 * Can be with/without parameters
 * Supports method overloading
 * Constructor can be chained using this keyword(constructor chaining)
 */