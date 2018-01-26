package threadPractice;

public class SleepMessages extends Thread{

	String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SleepMessages sm = new SleepMessages();
		//sm.trySimpleSleep();
		sm.trySimpleSleepWithInterrupt();
		}	
		 void trySimpleSleep() throws InterruptedException {
			for(int i = 0; i < importantInfo.length ; i++) {
				//Pause for 4 seconds
				Thread.sleep(3000);
				//print a message
				System.out.println(importantInfo[i]);
			}
		}
		
		 void  trySimpleSleepWithInterrupt() throws InterruptedException {
			 for (int i = 0; i < importantInfo.length; i++) {
				    // Pause for 3 seconds
				    try {
				        Thread.sleep(3000);
				    } catch (InterruptedException e) {
				        // We've been interrupted: no more messages.
				        return;
				    }
				    // Print a message
				    System.out.println(importantInfo[i]);
				}
		 }
	

}
