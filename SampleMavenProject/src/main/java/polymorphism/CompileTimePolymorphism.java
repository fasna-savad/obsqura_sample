package polymorphism;

public class CompileTimePolymorphism {
	
	public void sum (int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void sum (int a, float b) {
		float c=a+b;
		System.out.println(c);
	}
	
	public void sum (int a, int b, float c) {
		float d=a+b+c;
		System.out.println(d);
	}

	
	
	public static void main(String[] args) {
		CompileTimePolymorphism ctp =new CompileTimePolymorphism();
		ctp.sum(1, 1);
		ctp.sum(2, 0.1f);
		ctp.sum(5, 1, 0.2f);
		
		
		

	}

}
