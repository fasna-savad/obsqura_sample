package hierarchial_inheritance;

public class Daughter extends Father {
	public void div (int a, int b ) {
		int div= a/b;
		System.out.println(div);
	}

	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.div(10,2);
		d.sum(2, 2, 2);
		
		Son s= new Son();
		s.sum(5, 5, 5);
		s.sub(20,10);

	}

}
