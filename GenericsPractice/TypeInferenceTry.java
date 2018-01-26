package GenericsPractice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TypeInferenceTry {

	public static <U> void addBox( U u, List<Box<U>> boxes) {
		Box<U> box = new Box<>();
		box.setT(u);
		boxes.add(box);
		
	}
	
	public static <U> void outputBoxes( List<Box<U>> boxes) {
		int counter = 0;
		for(Box<U> box : boxes) {
			U boxContents = box.getT();
			 System.out.println("Box #" + counter + " contains [" +
		             boxContents.toString() + "]");
		      counter++;
		}
	}
	
	public static <U> U returnThisType(U u) {
		
		return u;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();
		TypeInferenceTry.<Integer>addBox (Integer.valueOf(10) , listOfIntegerBoxes); //type witness
		//TypeInferenceTry.addBox (Integer.valueOf(10) , new ArrayList<Box<String>> ());//gives compiler error
		TypeInferenceTry.addBox (Integer.valueOf(20) , listOfIntegerBoxes);
		TypeInferenceTry.addBox (Integer.valueOf(30) , listOfIntegerBoxes);
		
		new TypeInferenceTry().new MyClass<>("");
	}
	
	static <T> T pick(T a1, T a2) { return a2; }
	
	/* Constructore inference */
	
	class MyClass<X> {
		  <T> MyClass(T t) {
		    // ...
		  }
		}
	
	
}
