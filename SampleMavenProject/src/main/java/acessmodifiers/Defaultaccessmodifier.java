package acessmodifiers;

public class Defaultaccessmodifier {
	void defaulteg1() {
		int a=3;
		int square=a*a;
		System.out.println(square);
		
	}

public static void main(String[] args) {
	Defaultaccessmodifier ref = new Defaultaccessmodifier();
	ref.defaulteg1();
		
	}

}
