package forkJoinFW;

public interface SequentialArrayProcessor<T , R> {

	R computeValue(T[] values, int lowerIndex, int upperIndex);

}
