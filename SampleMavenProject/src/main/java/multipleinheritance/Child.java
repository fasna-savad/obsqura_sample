package multipleinheritance;

public class Child implements Parent1,Parent2 {

	public static void main(String[] args) {
		Child ref=new Child();
		ref.sum(2, 3);
		ref.sum2(1, 2);
	}

	@Override
	public void sum2(int c, float d) {
		float addition = c+d;
	System.out.println(addition);
	}

	@Override
	public void sum(int a, int b) {
		int y=a+b;
		System.out.println(y);
	}

}
