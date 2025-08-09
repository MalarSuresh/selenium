package com.studentAcademic;
import java.util.Scanner;
public class StudentDetails {
	String name;
	int i,j,Avg = 0;
	public void studentName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name : ");
		name=sc.nextLine();
		System.out.println("Hi "+name+"!");
		sc.close();
	}
	private void StudentId() {
		int studId=001;
		System.out.println("Hi "+name+", Your student ID is "+studId);
	}
	void grade() {
		System.out.println("Class IX");
	}
	public void marks() {
		int[] marks= {80,90,90,70,70};
		for(i=0;i<marks.length;i++) {
		System.out.println(marks[i]);
		j+=marks[i];
		}Avg=j/marks.length;
		System.out.println("Average: "+Avg);
	}
	protected void studentGrade() {
		switch(Avg) {
			case 40:
				System.out.println("Grade D");break;
			case 60:
				System.out.println("Grade C");break;
			case 80:
				System.out.println("Grade B+");break;
			case 90:
				System.out.println("Grade A+");break;
		}	
	}
	public static void main(String[] args) {
		StudentDetails stud=new StudentDetails();
		stud.studentName();
		stud.grade();
		stud.StudentId();
		stud.marks();
		stud.studentGrade();
	}
}
