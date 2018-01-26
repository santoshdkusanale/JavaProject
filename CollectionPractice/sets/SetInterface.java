package CollectionPractice.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Set<String> setFromAggrMethod = findDupsByAggr(args);
		System.out.println("Set from aggregates:"+setFromAggrMethod);
		Set<String> setFromForEachMethod = findDupsInForEach(args);
		System.out.println("Set from forEach:"+setFromForEachMethod);
		
		System.out.println("comparison:" +setFromAggrMethod.equals(setFromForEachMethod) );
		*/
		doSetGeneralOps();
	}
	
	public static Set<String> findDupsByAggr(String[] args) {
		Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
		return distinctWords;
	}

	public static Set<String> findDupsInForEach(String[] args){
		Set<String> distinctWords = new HashSet<String>();
        for (String a : args) {
        		distinctWords.add(a);
               	System.out.println(distinctWords.size() + " distinct words: " + distinctWords);
        }
        return distinctWords;
	}
	
	public static void doSetGeneralOps() {
		Set<String> s1 = new HashSet<>();
		Set<String> s2 = new HashSet<>();
		System.out.println("This returns true: " +s1.add("i"));
		s1.add("saw");
		System.out.println("This returns false: " +s1.add("i"));
		s1.add("did");
		
		s2.addAll(s1);
		s2.add("new");
		
		System.out.println("S1 is : "+s1);
		System.out.println("S2 is : "+s2);
		//union
		Set<String> unionSet = new HashSet<>();
		unionSet.addAll(s2);
		System.out.println("unionSet:"+unionSet);
		
		unionSet.addAll(s1);
		System.out.println("unionSet:"+unionSet);
		
		//intersection
		Set<String> interSet = new HashSet<>();
		interSet.addAll(s1);
		System.out.println("interSet:"+interSet);
		interSet.retainAll(s2);
		System.out.println("interSet:"+interSet);
		
		//difference
		Set<String> diffSet = new HashSet<>(s2);
		diffSet.removeAll(s1);
		System.out.println("diffSet:"+diffSet);
		
	}
}
