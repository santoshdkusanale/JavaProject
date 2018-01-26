package forkJoinFW;

import org.junit.Test;

public class Tester1 {

	@Test
	public void testSums() {
		for(int i=1 ; i<5 ; i++) {
			int arraySize = (int) Math.pow(10, i);
			Double[] nums = MathUtils.randomNums(arraySize);
			double sum1 = MathUtils.arraySum(nums);
			double sum2 = MathUtils.arraySumParallel1(nums);
			assertThat(sum1, is(closeTo( sum2, 0.000001)); //needs to be added
		}
	}
	
	public static void main(String[] args) {
		String message1= "Sequential sum of % , d numbers is % , .4f.";
		String message2 = "Parallel sum of % , d numbers is % , .4f.";
		
		for(int i=3 ; i < 9; i++) {
			int arraySize = (int) (Math.pow(10, i) / 2) ;
			Double[] nums = MathUtils.randomNums(arraySize);
			
			TimingUtils.timeOp(new Op() {
				@Override
				public String runOp() {
					double sum = MathUtils.arraySum(nums);
					return (String.format(message1, arraySize , sum));
				}
			});
			
			TimingUtils.timeOp(new Op() {
				@Override
				public String runOp() {
					double sum = MathUtils.arraySumParallel1(nums);
					return (String.format(message2, arraySize , sum));
				}
			});
		}
	}
}
