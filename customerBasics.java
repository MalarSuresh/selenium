package com.bankDetails;
public class customerBasics extends customerCredentials {
	@Override
	public void customerName() {
		System.out.println("Grandchild "
				+ "class-Print customer name");
		super.customerName();
	}
	@Override
	public void customerName(String name, int ID) {
		System.out.println("GrandChild class-This "
				+ "will print name and id: "+name+","+ID);
		super.customerName(name, ID);
	}
	@Override
	public void customerUsername() {
		System.out.println("Grandchild class-This ll "
				+ "print username");
		super.customerUsername();
	}
	public void customerBranch(String branchName) {
		System.out.println("Customer has account in "
				+ ""+branchName+" branch.");
	}
	
	public static void main(String[] args) {
		customerBasics cb=new customerBasics();
		cb.customerName();
		cb.customerName("Riyah", 1000232190l);
		cb.customerUsername();
		cb.customerBranch("Chromepet");
	}
	
}
