package forkJoinFW;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelArrayProcessor<T,R> extends RecursiveTask<R>{

	public static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
	
	private T[] values;
	private int parallelSizeCutOff;
	private SequentialArrayProcessor<T,R> smallSizeProcessor;
	private Combiner<R> valueCombiner;
	private int lowerIndex , upperIndex;
	@Override
	protected R compute() {
		// TODO Auto-generated method stub
		int range = upperIndex - lowerIndex;
		if(range <= parallelSizeCutOff) {
			return (smallSizeProcessor.computeValue(values, lowerIndex , upperIndex));
		}
		else {
			int middleIndex = lowerIndex + range/2;
			ParallelArrayProcessor<T, R> leftProcessor = new ParallelArrayProcessor<>
																						(values , parallelSizeCutOff , smallSizeProcessor , valueCombiner , lowerIndex, middleIndex);
		}
	}
	
}
