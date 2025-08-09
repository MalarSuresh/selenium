package iptTrialClass2;

/*functional interface has only one abstract method but many static and default methods, 
 *that abstract method can be implemented thru lambda expression/anonymous fn/closure
Lambda expression doesn't have return type,function name,access specifier*/

@FunctionalInterface
public interface Cab {
	void booking();
}
