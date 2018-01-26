package forkJoinFW;

import java.util.concurrent.ForkJoinPool;

public class MathUtils {
	public static double arraySum (Double[] nums, int lowerIndex, int upperIndex) {
		double sum = 0;
		
		for(int i = lowerIndex ; i <= upperIndex ; i++) {
			sum += nums[i];
		}
		return (sum);
		
	}
	
	public static double arraySum ( Double[] nums) {
		return (arraySum( nums , 0 , nums.length-1));
	}
	
	private static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
	
	public static Double arraySumParallel1 (Double[] nums) {
		return ( FORK_JOIN_POOL.invoke
				(new ParallelArraySummer(nums, 0, nums.length-1)));
	}
	
	public static Double[] randomNums(int length) {
		Double[] nums = new Double[length];
		
		for(int i=0 ; i< length ; i++) {
			nums[i] = Math.random();
		}
		
		return (nums);
	}
}
