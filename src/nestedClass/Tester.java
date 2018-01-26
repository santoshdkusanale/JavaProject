package nestedClass;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	A a =new A();
		A.StaticNested	na =a.new StaticNested();
				na.method1();*/
	}

}

class A {
	
	  class B{
		void method1 () {
			System.out.println("in non static");
		}
		
		 void method2() {
			System.out.println("In static");
		}
		
	}

	  static class C{
			void method1 () {
				System.out.println("in C non static");
			}
			
			static void method2() {
				System.out.println("In C static");
			}
			
		}

	 public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.method1();
		
		
		A.B c = new A().new B();
		c.method2();
		
		new A().new B().method1();
		
		A.C.method2();
		
		A.C c1 = new A.C(); 
		
		new A.C().method1();
	}
	 
	 public void new1() {
		 B b = new B();
		 b.method1();
		 
		  class D{
				void method1 () {
					System.out.println("in C non static");
				}
				
				static void method2() {
					System.out.println("In C static");
				}
				
			}
	 }
}