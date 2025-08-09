package IPT.iptTrialClass;

public class CallingEnumClass {
	
	private static void browserLaunch(EnumClass name) {
		if(name==EnumClass.Chrome) {
			System.out.println("Launch Chrome Browser");
		}
		else if(name==EnumClass.Edge) {
			System.out.println("Launch Edge Browser");
		}
	}

	public static void main(String[] args) {
//		browserLaunch(EnumClass.Chrome);
		browserLaunch(EnumClass.Edge);

		
	}

}
