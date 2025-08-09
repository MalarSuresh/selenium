package com.javabasics;
import java.util.*;
public class MapEx {
	public void HashMapMethod() {
		Map<Integer,String> hm=new HashMap<>();
		hm.put(1, "Ashifa");
		hm.put(2, "Aadhira");
		hm.put(3, null);
		hm.put(null, "Laya");
		System.out.println("HashMap key value pairs: "+hm);
		Collection<String> values = hm.values();
		System.out.println(values);
		System.out.println("Does hm contain 3 :"+hm.containsKey(3));
		System.out.println("Does hm contain null :"+hm.containsValue(null));
		hm.clear();
		System.out.println(hm);
	}
	public void LinkedHashMapMethod() {
		Map<Integer,String> hm=new HashMap<>();
		hm.put(2, "Ashwarya");
		hm.put(1, "Aadhi");
		hm.put(4, null);
		hm.put(null, "Layan");
		Map<Integer,String> lhm=new LinkedHashMap<>();
		lhm.putAll(hm);
		lhm.put(3, "Hima");
		lhm.put(6, "Nithi");
		System.out.println("LinkedHashMap key value pairs: "+lhm);
		int a=lhm.size();
		System.out.println("size of lhm: "+a);
		String getValue=lhm.get(3);
		System.out.println("Value of 3 is : "+getValue);
		Set<Integer> keySet = lhm.keySet();
		System.out.println(keySet);
	}
	public void TreeMapMethod() {
		Map<Integer,String> tm=new TreeMap<>();
		System.out.println("Does tm contain 2 :"+tm.containsKey(2));
		System.out.println("Is tm Empty: "+tm.isEmpty());
		System.out.println("TreeMap key value pairs: "+tm);
		tm.put(3, "Hima");
		tm.put(6, "Nithi");
		tm.put(2, "Ashwarya");
		tm.put(1, "Aadhi");
		tm.put(4, "Nivin");
		tm.put(5, "Layan");
		System.out.println("TreeMap key value pairs: "+tm);

	}
	public static void main(String[] args) {
		MapEx me=new MapEx();
		me.HashMapMethod();
		me.LinkedHashMapMethod();
		me.TreeMapMethod();
	}

}
