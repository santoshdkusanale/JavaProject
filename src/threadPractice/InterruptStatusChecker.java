package threadPractice;

public class InterruptStatusChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread(new InterruptStatusChecker().new TestThreader());
		/*
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//System.out.println("is interrupted after execution:"+th.isInterrupted());
		//System.out.println("is alive after execution:"+th.isAlive());
		
		th.start();
	}
	
	public class TestThreader implements Runnable{


		String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("interrupt status before loop:"+Thread.currentThread().isInterrupted());
			
			 for (int i = 0; i < importantInfo.length; i++) {
				    // Pause for 3 seconds
				    try {
				        //Thread.sleep(3000);
				        if(i==1) {
				        	System.out.println(Thread.interrupted());
				        	//Thread.currentThread().interrupt();
				        	if(Thread.currentThread().isInterrupted()) {
				        		System.out.println("Thread isInterrupted at : "+i);
				        		System.out.println(Thread.currentThread().isInterrupted());
				        		System.out.println(Thread.interrupted());
				        		System.out.println("Repeat check: "+Thread.interrupted());
				        		System.out.println("Repeat check again: "+Thread.interrupted());
				        		System.out.println("======================================================");
				        		return;
				        	}
				        	else {
				        		System.out.println("not interrupted");
				        		//return;
				        	}
				        }
				        if(i==2) throw new InterruptedException();
				        
				    } catch (InterruptedException e) {
				        // We've been interrupted: no more messages.
				    	System.out.println("test thread interrupted:"+this); //will print current thread obj
				    	System.out.println(Thread.currentThread());
				    	System.out.println(Thread.currentThread().isInterrupted());
				    	System.out.println(Thread.currentThread().isAlive());
				    	
				        return;
				    }
				    // Print a message
				    System.out.println(importantInfo[i]);
				}
		 
			
		}
		
	}
}
