package hierarchial_inheritance;

public class Son extends Father {
	
	public void sub (int a, int b ) {
		int sub = a-b;
		System.out.println(sub);
	}

	public static void main(String[] args) {
		Son s= new Son();
		s.sum(5, 5, 5);
		s.sub(20,10);

	}

}
