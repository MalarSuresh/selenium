package iptTrialClass2;

public interface Java8Features {
	void dummy();
	void dummy1();
	static void dummy2() {
		
		System.out.println("This is static block");
	}
	default void dummy3() {
		System.out.println("This is default block");
	}

}
