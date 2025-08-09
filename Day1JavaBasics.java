package iptTrialClass;

public class Day1JavaBasics {
	public Day1JavaBasics() {
		System.out.println("Parent class constructor");
	}

	public static void main(String[] args) {
		System.out.println(' ');									//	space
		System.out.println(0+' ');									//	32
		System.out.println('D');									//	D
		System.out.println('D'+'A'+'D');							//	201
		System.out.println("D"+'A'+'D');							//	DAD	
		System.out.println('D'+'A'+"D");							//	133D
		int num='a';		System.out.println(num);				//	97
		char ch=100;		System.out.println(ch);					//	d
		int String=10;		System.out.println(String);				//	10
		int Day1JavaBasics=10; System.out.println(Day1JavaBasics);	//10
		int $=10;			System.out.println($);					//10
//		int *=10;			System.out.println(*); 					// 	Compile time error		
//		int void=10; 		System.out.println(void);				// 	Compile time error

		int i=10;
//			   10	  11   12	
		int j=i++ + -++i -i++;   System.out.println(i+" "+j); 		//13  -14
//		       10    -12   -12
	}
}
