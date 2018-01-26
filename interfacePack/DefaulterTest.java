package interfacePack;

public class DefaulterTest implements Defaulter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaulterTest test = new DefaulterTest();
		
		DefaulterUser user = test.new DefaulterUser();
		user.method1();
		
		DefaulterExtenderUser user1 = test.new DefaulterExtenderUser();
		user1.method1();
		
		DefaulterAbstractorUser user2 = test.new DefaulterAbstractorUser();
		user2.method1();
		
		
		
	}
	
	class DefaulterUser implements Defaulter{
		
	}
	//This class redefines interface defined abstract method
	interface DefaulterExtender extends Defaulter{
		default void method1() {
			System.out.println("In default extending method of DefaulterExtender");
		}
	}
	
	class DefaulterExtenderUser implements DefaulterExtender{
		void methodInFirstInnerClass() {
			method1();
		}
	}
	
	//This class abstracts the method defined in parent interface
	interface DefaulterAbstractor extends Defaulter{
		void method1();
	}
	
	class DefaulterAbstractorUser implements DefaulterAbstractor{

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			System.out.println("In DefaulterAbstractorUser");
		}
		
	}
	
}
