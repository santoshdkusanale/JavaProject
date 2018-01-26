package threadPractice;

public class FirstThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		t.setName("MainThread"); //default name is main
		System.out.println("Name of thread is : "+t);
		System.out.println("Group of thread:"+t.getThreadGroup());
	}

}
