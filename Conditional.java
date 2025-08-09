package com.javabasics;
public class Conditional {
	private void bookShop() {
		String lang1 = "JAVA";String lang2 = "Python";String lang3 = "COBOL";
		if (lang1 == lang2) {					//if else
			System.out.println("This is a conditional statement");
		} else {
			System.out.println("JAVA and Python are two different languages");
		}
		if (lang1 == lang2) {					//if elseif else
			System.out.println("Java and Python are not same");
		} else if (lang2 == lang3) {
			System.out.println("Python and COBOL are not same");
		} else {
			System.out.println("JAVA, Python and COBOL are not same");
		}
	}
	private void gadgetShop() {
		String[] seller = { "Laptop", "Pendrive", "Headphones" };
		for (int i = 0; i <= 2; i++) {				//for loop
			if (seller[i] == "Laptop") {
				System.out.println("Laptops are available");
			} 
			else {
				System.out.println("pendrives and headphones are also available");
			}
		}
	}
	public static void main(String[] args) {
		Conditional cond = new Conditional();
		cond.bookShop();
		cond.gadgetShop();
	}
}
