package GenericsPractice;

public class Box<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public <U extends Number> void inspect (U u) {
		System.out.println("T :"+t.getClass().getName());
		System.out.println("U: "+u.getClass().getName());
	}
	
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
        integerBox.setT(new Integer(10));
        //integerBox.inspect("some text"); // error: this is still String!
	}
}
