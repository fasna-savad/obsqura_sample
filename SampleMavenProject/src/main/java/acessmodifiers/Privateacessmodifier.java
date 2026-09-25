package acessmodifiers;

public class Privateacessmodifier {
	private void area() {
		int a=5;
		int b=10;
		int area= a*b;
		System.out.println(area);
	}

	public static void main(String[] args) {
		Privateacessmodifier eg1 = new Privateacessmodifier();
		eg1.area();

	}

}
//private can be accessed in same class
