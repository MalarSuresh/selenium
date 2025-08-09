package iptTrialClass;

public class Day1javaBasicss extends Day1JavaBasics {
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static block");
	}
	public Day1javaBasicss() {
		System.out.println("Child Constructor");
	}
	private void name() {
		System.out.println('M' +"Sureshkumar");
		System.out.println("Malarvizhi" +"Sureshkumar");
	}
	public static void main(String[] args) {
		new Day1javaBasicss().name();
		main("Malar");
		main(100);
	}
	public static void main(String args) {
		System.out.println("Main method with string args: " +args);
		
	}
	public static void main(int args) {
		System.out.println("Main method with integer args: " +args);
	}	
}
