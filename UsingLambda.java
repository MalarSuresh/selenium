package iptTrialClass2;

public class UsingLambda{

/*
 * Instead of using all the below lines we can use lambda expression
 * No need to create object,call the functions to implement, straight away write it in main method using () ->
 
  public class UsingLambda implements Cab{
	

	@Override
	public void booking() {
		System.out.println("Cab needs to be booked using normal method");		
	}
	
	public static void main(String[] args) {
		UsingLambda ul=new UsingLambda();
		ul.booking();
	}
	*/


	public static void main(String[] args) {
		Cab c=() -> System.out.println("Cab needs to be booked");
		c.booking();
	}
}
