package aggregateOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StatefullLambdaTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> serialStorage =new ArrayList<>();
		Integer[] intArray = {1,2,3,4,5,6,7,8};
		
		List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
							
		
		System.out.println("Serial Stream");
		listOfIntegers
			.stream()
			
			 // Don't do this! It uses a stateful lambda expression.
			.map( e -> {
						serialStorage.add(e);
						return e;
					})
			.forEachOrdered(e -> System.out.print(e + " "));
		System.out.println(" ");
		
		serialStorage
			.stream()
			.forEachOrdered(e -> System.out.print(e + " "));
		System.out.println(" ");
		
		//Parallel code begins
		System.out.println("Parallel Stream");
		
		//List<Integer> parallelStorage = Collections.synchronizedList(new ArrayList<>());
		List<Integer> parallelStorage = 	new ArrayList<>(); //this gives erratical results
		listOfIntegers
			.parallelStream()
			
			 // Don't do this! It uses a stateful lambda expression.
		    .map(e -> { parallelStorage.add(e); return e; })
		    
		    .forEachOrdered(e -> System.out.print(e + " "));
		
		System.out.println("");
		
		parallelStorage
	    	.stream()
	    	.forEachOrdered(e -> System.out.print(e + " "));
		System.out.println("");
	}

}
