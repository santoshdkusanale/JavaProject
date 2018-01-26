package test;

import java.util.Arrays;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stringArray = { "Barbara", "James", "Mary", "John",
			    "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareTo);
		System.out.println(stringArray);//prints object
	}

}
