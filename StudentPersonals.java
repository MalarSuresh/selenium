package com.studentPersonalDetails;

import com.studentAcademic.StudentDetails;

public class StudentPersonals extends StudentDetails{
	public void parentsNames() {
		System.out.println("Parents name will be printed here ");		
	}
	
	public static void main(String[] args) {
		StudentPersonals sp=new StudentPersonals();
		sp.studentName();
		sp.marks();
		sp.studentGrade();
		sp.parentsNames();
	}

}
