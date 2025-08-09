package iptTrialClass2;

public class ImplementingJava8Interface implements Java8Features {

	@Override
	public void dummy() {
		System.out.println("Abstract method");
	}

	@Override
	public void dummy1() {
		System.out.println("Abstract method");		
	}
	public static void main(String[] args) {
		ImplementingJava8Interface ii=new ImplementingJava8Interface();
		ii.dummy();
		ii.dummy1();
		ii.dummy3();
		Java8Features.dummy2();
	}
}
