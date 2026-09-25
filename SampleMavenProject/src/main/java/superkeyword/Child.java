package superkeyword;

public class Child extends Parent {
	int a=20;
	
	public Child() {
		System.out.println(a);
		System.out.println(super.a); //Refers the immediate parent class instance variable
//super works only inside a constructor or a normal method, never inside static methods.
	}

	public static void main(String[] args) {
		Child ch = new Child();
		

	}

}
