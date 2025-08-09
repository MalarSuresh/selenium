package com.javabasics;
import java.util.Arrays;
public class AccessSpecifiers {
	private void credentials() {
		String username="Anu32";
		System.out.println("Username: "+username);
		}
	private void mailId() {
		String mailId="anu@gmail.com";
		System.out.println("Email me @ "+mailId);
	}
	void custId() {	System.out.println("Customer Id 9876");	}
	public void accDetails() {
		long accNo=321654987l;
		System.out.println("Account number: "+accNo);
	}
	public void ifsc() {
		short IFSC=4321;
		System.out.println("IFSC: "+IFSC);
	}
	protected void bankName() {	System.out.println("Indian Overseas Bank");	}
	protected void name() {	System.out.println("Anuradha");	}
	protected void location() {
		String[] address={"plot no 15","kamarajar street","chennai","600056"};
		System.out.println(Arrays.toString(address));
	}
	public static void main(String[] args) {
		AccessSpecifiers acc=new AccessSpecifiers();
		acc.bankName();
		acc.ifsc();
		acc.accDetails();
		acc.name();
		acc.custId();
		acc.credentials();
		acc.location();
		acc.mailId();
	}
}
