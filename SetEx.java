package com.javabasics;
import java.util.*;
public class SetEx {
	public SetEx() {
		this.TreeSetEx();
			System.out.println("-----This is a constructor using HashSet-----");
		Set<String> set = new HashSet<> (); 
		set.add("Malar");  
		set.add("Ajay"); 
		set.add("Vijay"); 
		set.add("Ajay"); 
		set.add("MALAR");
		int size=set.size();
			System.out.println(size);
			System.out.println("The values are: "+set);		
	}
	public static void LinkedHashSetEx() {
			System.out.println("--------This is LinkedHashSetExample--------");
		Set<String> FlSet=new LinkedHashSet<>();
		Set<String> set = new HashSet<> (); 
		set.add("Malar");
		set.add("Ajay");
		set.add("Vijay");
		set.add("Ajay");
		set.add("MALAR");
		FlSet.addAll(set);
			System.out.println("Linked HashSet values: "+FlSet);
		boolean check=FlSet.contains("Ajay");
			System.out.println("Does FlSet contain Ajay: "+check);
			System.out.println("------"+FlSet.containsAll(set)+"--------");
		FlSet.add("Riya");
		FlSet.add("Hima");
			System.out.println("Linked HashSet values: "+FlSet);
		boolean retain=FlSet.retainAll(set);
			System.out.println(retain + " "+FlSet+ "  Size:  "+FlSet.size());
			System.out.println(FlSet.remove("MALAR") +" "+FlSet);
			System.out.println("------"+FlSet.removeAll(set)+"--------");
	}
	public void TreeSetEx() {
			System.out.println("----TreeSet Method is being called from Constructor.----");
		Set<Float> treeSet=new TreeSet<>();
		boolean isEmptyChec=treeSet.isEmpty();
			System.out.println("Is treeset empty: "+isEmptyChec+" "+treeSet);
	}
	public static void main(String[] args) {
		new SetEx();		
		SetEx.LinkedHashSetEx();		
		}
}
