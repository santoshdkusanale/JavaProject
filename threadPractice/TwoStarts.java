package threadPractice;

public class TwoStarts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(
				() -> {
					System.out.println("Running thread " +Thread.currentThread());
					
				}
				);
		t1.start();
		t1 = new Thread(
				() -> System.out.println("Running thread " +Thread.currentThread())
				);
		t1.start();
		/*Thread t2 = t1;
		t2.start();//throws IllegalThreadStateException
*/	}

}
