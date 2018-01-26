package test;

public class InterfaceImplementer implements interface1, interface2 {

	public static void main(String[] args) {

		Car c = new Car("red");
		System.out.println("color :  " + c.getColor());

		blue(c);
		System.out.println("color :  " + c.getColor());

	}

	private static void blue(Car c) {
		c.setColor("blue");
		c = new Car("pink");
		c.setColor("yellow");
	}

	@Override
	public void getThis() {
		// TODO Auto-generated method stub

	}

}
