package in.com.constructor;

public class TestShape {
	public static void main(String[] args) {

		Shape s1 = new Shape();

		Shape s2 = new Shape("black", 21);

		System.out.println(s2.getColor());
		System.out.println(s2.getBorderWidth());

	}

}
