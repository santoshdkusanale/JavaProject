package interfacePack;

public class StaticerImplementer implements Staticer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticer.printMsg();
		new StaticerImplementer().printMsg();
		printMsgStatic();
	}
	
	void printMsg() {
		System.out.println("I am method from the caller class");
	}
	
	static void printMsgStatic() {
		System.out.println("I am a static method from the caller class");
	}

}
