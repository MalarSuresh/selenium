package iptTrialClass;

// print 1-100 without using numbers in program

public class NoNumberPGM {
	public static void main(String[] args) {
		int m='b';			//	98
		int n='a';			//	97	
		int p='d';			//	100
		int i;
		
		System.out.println("m value "+m);
		System.out.println("n value "+n);
		System.out.println("p value "+p);

		for (i=m-n;i<=p;i++)
			System.out.println(i);
		
//	     for (int i = (int)'b' - (int)'a'; i <= (int)'d'; i++)  
//	            System.out.println(i); 
	}
}
