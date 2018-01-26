package test;

public class StaticWithParent {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.printSI();
		a.printS();
		
		A a2 = null;
		a2.printS();
		new B().printS();
	}

}

 class A {
	static void printS() {
		System.out.println("in parent static");
	}
	
	void printSI() {
		System.out.println("in parent instance");
	}
	
}
 
	class B extends A {
		static void printS() {
			System.out.println("in child static");
		}
		
		 void printSI() {
			System.out.println("in child instance");
		}
		
	}