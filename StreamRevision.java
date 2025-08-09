package iptTrialClass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRevision {

	//using asList function of array
	
	public static void main(String[] args) {
		List<Integer> m= new ArrayList<>();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(30);
		m.add(20);
		m.add(10);
		System.out.println(m);
		System.out.println("*************************");
		List<Integer> numlist= Arrays.asList(13,24,12,45,60);
		System.out.println(numlist);
		
		
		System.out.println("********without stream*******");
		List<Integer> evenList=new ArrayList<>();
		for(Integer n:numlist) {
			if(n%2 == 0)
				evenList.add(n);
		}
			
		System.out.println(evenList);
	
	System.out.println("***********with stream*********");
	//Using filter method in stream
	List<Integer> evenListStream= new ArrayList<>();
	evenListStream= numlist.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println(evenListStream);

	
	}

}
