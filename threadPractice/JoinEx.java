package threadPractice;

public class JoinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread( 				
				() -> {
					for( int i =0; i<3 ; i++) {
						System.out.println("Printing from thread :"+Thread.currentThread().getName()+" with value:"+i);
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
				);
		System.out.println("This should be from main thread:"+Thread.currentThread().getName());
		t1.start();
		System.out.println("Joining t1");
		try {
			t1.join(2000);
			System.out.println("This 2nd should be from main thread:"+Thread.currentThread().getName());
			throw new InterruptedException();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
