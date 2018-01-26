package GenericsPractice;
import java.util.List;
import java.util.ArrayList;
public class GuideLineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EvenNumber> le = new ArrayList<>();
		le.add(new GuideLineTest().new EvenNumber(23));
		List<? extends NaturalNumber> ln = le;
		
		display(ln);
		
	}
	
	public static <T> void display(List<T> list) {
		System.out.println("T is :"+ list);
		for ( T t : list) {
			System.out.println(t);
		}
	}
	class NaturalNumber {

	    private int i;

	    public NaturalNumber(int i) { this.i = i; }
	    // ...
	    public String toString() {
			return Integer.toString(i);
	    	
	    }
	}

	class EvenNumber extends NaturalNumber {

	    public EvenNumber(int i) { super(i); }
	    // ...
	    
	}
}
