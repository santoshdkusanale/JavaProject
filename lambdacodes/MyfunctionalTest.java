package lambdacodes;

public class MyfunctionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "pass";
		callFunctionalMethod(
			s ->	{
				System.out.println("in functional interface method");
				System.out.println(s);
			}
				);
		
	}

	public static void callFunctionalMethod(MyFunctional inter) {
		String pass = "in method";
		inter.performAction(pass);
	}
}
