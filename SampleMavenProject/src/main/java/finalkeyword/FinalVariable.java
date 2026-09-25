package finalkeyword;

public class FinalVariable {
 
	public static void main(String[] args) {
		int a=10;
		a=30;
		System.out.println(a);
		
		final int b=20;
		//b=25;  //final variable cannot be modified
		System.out.println(b);

	}

}
