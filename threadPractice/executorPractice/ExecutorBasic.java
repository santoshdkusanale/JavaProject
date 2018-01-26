package threadPractice.executorPractice;

public class ExecutorBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approach 1 : Use separate class implementing Runnable
		//new App1();
		
		//Approach 2 : Same class implements Runnable
		new App2(6); //this will give a fixed counter for every thread
		
	}

}
