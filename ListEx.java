package com.javabasics;
import java.util.*;
public class ListEx {
	public static void main(String[] args) {
		List<String> a=new ArrayList<>();
		a.add("Suresh");
		a.add("Malar");
		a.add("Kumar");
		a.add(null);
		a.add("Vizhi");
		int b=a.size();
			System.out.println("Size of a :"+b);
			System.out.println(a);
		String valueOf2=a.get(2);
			System.out.println("Value in Index2 is "+valueOf2);
		String setValue=a.set(3, "Jintu");
			System.out.println("----The changed value is "+setValue);
			System.out.println(a);
		String removedValue=a.remove(4);
			System.out.println("----Removed value is "+removedValue);
			System.out.println(a);
		a.clear();
			System.out.println(a);
		List<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(null);
		ll.add(5);		
			System.out.println(ll);
		ll.set(3, 10);
			System.out.println(ll);
		ll.removeAll(ll);
			System.out.println(ll);
		List<Float> fl=new Vector<>();
		fl.add(3.3f);
		fl.add(null);
		fl.add(6.3f);
		fl.add(3.5f);
			System.out.println("Vector List values: "+fl);
		fl.set(1,4.5f);
		fl.set(3,4.3f);
			System.out.println("Vector List changed values: "+fl);	
	}
}
