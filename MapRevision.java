package iptTrialClass2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapRevision {
	public static void main(String[] args) {
		
		//Hashmap allows null values in keys values
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1,null);
		map.put(2, null);
		map.put(null, "malar");
		System.out.println(map);
		
		//HashTable doesn't allow neither null keys nor null values
		Map<Integer,String> hashT=new Hashtable<>();
//		hashT.put(1,null);
		hashT.put(2,"Devi");
		hashT.put(3,"Priya");
		hashT.put(4,"Malar");

		
		System.out.println(hashT); 		//if we give null values gives run time exc - Null pointer exception 
		
	}
}
