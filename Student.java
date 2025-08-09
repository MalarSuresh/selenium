package iptTrialClass2;

public class Student {
		int id;
		String name;
		String address;
		
		//When there is no default constructor, parameterized constructor ll be called
		
		public Student(int i,String n,String add){
			id=i;
			name=n;
			address=add;
		}
}
