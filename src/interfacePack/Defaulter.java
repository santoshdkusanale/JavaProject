package interfacePack;

public interface Defaulter {

	default void method1() {
		System.out.println("In default method ");
	}
	
}
