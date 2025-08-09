package iptTrialClass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringRevision {

	public static void main(String[] args) {
		
		String b=new String("Malar");
		String c=new String("Malar");
		String d="Malar";
		String e="Malar";

		
		if(e==b) {	System.out.println("Both are same");	}else {System.out.println("different");}
		if(b==c) {	System.out.println("Both are same");	}else {System.out.println("different");}
		if(b==d) {	System.out.println("Both are same");	}else {System.out.println("different");}
		if(e==d) {	System.out.println("Both are same");	}else {System.out.println("different");}

		//Object array is used when we need to add different datatype values in one variable
		Object[] a=new Object[5];
		a[0]=10;
		a[1]="Malar";
		a[2]=2.5;
		a[3]='H';
		a[4]=12345;

		
		List<Object> l=new ArrayList<Object>();
		l.add(100);
		l.add("Vizhi");
		l.add('N');
		l.add(3.56);
		System.out.println("Array values : "+Arrays.toString(a));
		System.out.println("ArrayList values: "+l);

		//converting list to set
		List<Integer> m= new ArrayList<>();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(30);
		m.add(20);
		m.add(10);
		m.add(40);
		m.add(null);				//All wrapper class object will have default value as null
		System.out.println("values of list: "+m);		// has duplicate values [10, 20, 30, 30, 20, 10, 40]
		
		//add list variable m as a value 
		Set<Integer> n= new HashSet<>(m);
		System.out.println("Values in a set :" +n);		// has only unique values [20, 40, 10, 30]
		
		
	}

}
