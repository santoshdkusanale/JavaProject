package aggregateOperations;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class ParallelStreamOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> roster = Person.createRoster();

		//find average age in parallel for Male members of list 
		double average = roster
				.parallelStream()
				.filter(p -> p.getGender() == Person.Sex.MALE)
				.mapToInt(Person::getAge)
				.average()
				.getAsDouble();
		
		System.out.println("average is :"+average);
		System.out.println("==================================================");
		
		//Group members by Gender
		
		ConcurrentMap<Person.Sex , List<Person>> byGender= roster
				.parallelStream()
				.collect(
						Collectors.groupingByConcurrent(Person::getGender)
						);
		
		System.out.println("byGender is :"+byGender);
		System.out.println("==================================================");
		
		
	}

}
