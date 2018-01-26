package forkJoinFW;

import java.util.concurrent.RecursiveTask;

public class ParallelArraySummer extends RecursiveTask<Double> {

	private static final int PARALLEL_CUTOFF = 1000;
	private Double[] nums;
	private int lowerIndex , upperIndex;
	
	public ParallelArraySummer(Double[] nums , int lowerIndex , int upperIndex) {
		this.nums = nums;
		this.lowerIndex = lowerIndex;
		this.upperIndex = upperIndex;
	}
	
	//This is the thing !
	@Override
	protected Double compute() {
		// TODO Auto-generated method stub
		int range = upperIndex - lowerIndex ;
		if (range <= PARALLEL_CUTOFF) {
			return (MathUtils.arraySum(nums, lowerIndex, upperIndex));
		}
		else {
			int middleIndex = lowerIndex + range / 2 ;
			ParallelArraySummer leftSummer = 
					new ParallelArraySummer(nums, lowerIndex, middleIndex);
			ParallelArraySummer rightSummer =
					new ParallelArraySummer(nums, middleIndex + 1, upperIndex);
			
			//Here we initiate splitting of tasks
			leftSummer.fork();
			Double rightSum = rightSummer.compute();
			Double leftSum = leftSummer.join();
			
			return (leftSum + rightSum);
		}
		
	}

}
