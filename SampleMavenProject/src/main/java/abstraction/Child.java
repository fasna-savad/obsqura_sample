package abstraction;

public class Child extends Parent{
	
	//method sub not necessary
	public void sub(int x, int y) {
		int sub=x-y;
		System.out.println(sub);
	}

	public static void main(String[] args) {
		Child ref=new Child();
		ref.sub(20,10);
		ref.addition(2, 1);
		ref.sum(9, 3);

	}

	@Override
	public void sum(int a, int b) {
		int value = a+b;
		System.out.println(value);
		
	}

} 
