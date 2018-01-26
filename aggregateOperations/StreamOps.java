package aggregateOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> roster = Person.createRoster();

		//Print all persons
		roster
			.stream()
			.forEach(p -> System.out.println(p.getName()));
		
		System.out.println("=================================================");
		//Print all persons with Gender as Male
		roster
			.stream()
			.filter(p -> p.getGender() == Person.Sex.MALE)
			.forEach(p -> System.out.println(p.getName()));
		
		System.out.println("==================================================");
		
		//Average
		double average = roster
										.stream()
										.filter(p -> p.getGender() == Person.Sex.MALE)
										.mapToInt(Person::getAge)
										.average()
										.getAsDouble();
		
		System.out.println("Average is :"+average);
		
		Integer totalAge = roster
											.stream()
											.mapToInt(Person::getAge)
											.sum();
		System.out.println("totalAge is :"+totalAge);
		 
		//Reduce operation
		Integer totalAgeReduce = roster
												.stream()
												.map(Person::getAge)
												.reduce(
														0,
														(a,b) -> a+b
														);
		System.out.println("totalAgeReduce is :"+totalAgeReduce);
		System.out.println("==================================================");
		
		//Collect operation
		
		Averager averageCollect = roster.stream()
					.filter(p -> p.getGender() == Person.Sex.MALE)
					.map(Person::getAge)
					.collect(Averager::new , Averager::accept, Averager::combine );
		
		System.out.println("Average age of male members: " +
			    averageCollect.average());
		
		System.out.println("==================================================");
		
		//Put names of male members in a collection
		List<String> namesOfMaleMembersCollect = roster
					.stream()
					.filter(p -> p.getGender() == Person.Sex.MALE)
					.map(p -> p.getName())
					.collect(Collectors.toList());
		
		System.out.println("Names of male members: " +
				namesOfMaleMembersCollect);
		
		System.out.println("==================================================");
		
		//Group by Gender
		
		Map<Person.Sex , List<String>> namesByGender =
				roster
				.stream()
				.collect(
						Collectors.groupingBy(
								Person::getGender,
								Collectors.mapping(
										Person::getName,
										Collectors.toList() //
										)
								)
						);
		
		System.out.println("Names by gender: " +
				namesByGender);
		
		System.out.println("==================================================");
		
		//retrieve total age of members of each gender
		
		Map<Person.Sex, Integer> totalAgeByGender = 
				roster
				.stream()
				.collect(
						Collectors.groupingBy(
								Person::getGender,
								Collectors.reducing(
										0,
										Person::getAge,
										Integer::sum
								)
						)
					);
		
		System.out.println("Total age by gender: " +
				totalAgeByGender);
		
		System.out.println("==================================================");
		
		//retrieves the average age of members of each gender
		Map<Person.Sex, Double> averageAgeByGender = roster
			    .stream()
			    .collect(
			        Collectors.groupingBy(
			        		Person::getGender,
			        		Collectors.averagingInt(
			        				Person::getAge
			        				)
			        		)
			        );
		
		System.out.println("Average age by gender: " +
				averageAgeByGender);
		
		System.out.println("==================================================");
	}

}
