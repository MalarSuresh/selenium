package iptTrialClass2;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithClass {
		private static void form() {
			
			//giving student class as a wrapper class - user defined class as wrapperclass
			
			List<Student> list=new ArrayList<>();
			Student s1=new Student(1," Malar ","Chennai");
			Student s2=new Student(3," Priya ","Cochin");
			Student s3=new Student(2," Devi ","Coimbatore");
			list.add(s1);
			list.add(s3);
			list.add(s2);
			
			
			for (Student student : list) {
				System.out.println("Values "+student.id+student.name+student.address);
			}
		}
		
	public static void main(String[] args) {
		form();
	}

}
