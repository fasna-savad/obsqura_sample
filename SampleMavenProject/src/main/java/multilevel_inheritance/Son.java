package multilevel_inheritance;

public class Son extends Father{
	
	public void sum3 (int a, int b, int c) {
		int sum3 = a+b+c;
		System.out.println(sum3);
		
	}

	public static void main(String[] args) {
		
		Son s = new Son ();
		s.sum(1, 2, 3);
		s.sum2(5, 5, 5);
		s.sum3(1, 1, 1);
		

	}

}
