package abstraction_interface;

public class Child implements Interface {
	
	public void inher(int q, float w) {
		float sum = q+w;
        System.out.println(sum);		

		
	}

	public static void main(String[] args) {
		Child ref = new Child();
		ref.inher(1, 1);
		ref.multiply(9, 9);

	}

	@Override
	public void multiply(int a, int b) {
		int multi=a*b;
        System.out.println(multi);		
	}

}
