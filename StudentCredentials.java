package com.studentAcademic;

public class StudentCredentials {
	private static void studUsername() {
		String studentUsername="Any name";
		System.out.println("Username : "+ studentUsername);
	}
	final void password() {
		System.out.println("Password should have 8 characters with atleast 1 spl character.");
	}
	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails();
		sd.studentName();
		StudentCredentials sc=new StudentCredentials();
		studUsername();
		sc.password();
		}
}
