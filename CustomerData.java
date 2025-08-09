package com.bankDetails;

public class CustomerData {
	
	
	public void customerName() {
		System.out.println("ParentClass-This will "
				+ "print customer name");
	}
	public void customerName(String name,int ID) {
		System.out.println("ParentClass-This will "
				+ "print name and ID: "+name+",  "+ID);
	}
	public void customerName(String name,long accNo)
	{
		System.out.println("ParentClass-This will"
			+ " print name and AcccNo: "+ name+",  "+accNo);
	}
	
	
	
	public static void main(String[] args) {
		CustomerData cd=new CustomerData();
		cd.customerName();
		cd.customerName("Anu",01);
		cd.customerName("Aarav",1000078689);
	}

}
