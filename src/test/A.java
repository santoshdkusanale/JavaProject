package test;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ab = 10;
		A a = (A)new B();
		
		B b = (B) new A();
		Object i = Integer.valueOf(42);
		String s = (String)i; 
		//A a = (A)new C();
	}

}
class C{
	
}
class B extends A {
	
}