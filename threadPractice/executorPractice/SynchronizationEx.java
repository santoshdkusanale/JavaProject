package threadPractice.executorPractice;

public class SynchronizationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		new RaceConditionApp();
	}

}
