package threadPractice.executorPractice;

public class Counter implements Runnable {

	private final App1 mainApp;
	private final int loopLimit;

	public Counter(App1 mainApp, int loopLimit) {
		// TODO Auto-generated constructor stub
		this.mainApp = mainApp;
		this.loopLimit = loopLimit;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i < loopLimit ; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf( "%s: %s%n" , threadName , i );
			mainApp.pause(Math.random());
		}
	}

}
