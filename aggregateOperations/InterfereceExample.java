package aggregateOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterfereceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfStrings= 
				new ArrayList<>(Arrays.asList("one","two")) ;
		
		/* This will fail as peek operation will attempt to add the string "three" to the source 
		 * after terminal operation has commenced
		 */
		
		String concatenatedString = listOfStrings
				.stream()
				
				 // Don't do this! Interference occurs here.
				.peek(s -> listOfStrings.add("three"))
				
				.reduce((a,b) -> a + " " + b)
				.get();
		
		System.out.println("Concatenated string: " + concatenatedString);
	}

}
