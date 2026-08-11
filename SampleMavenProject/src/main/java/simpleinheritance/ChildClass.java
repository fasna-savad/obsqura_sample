package simpleinheritance;


public class ChildClass extends ParentClass {
	public void sub (int a , int b ) {
		int sub = a-b;
		System.out.println(sub);
	}

	public static void main(String[] args) {
		ChildClass calc = new ChildClass();
		calc.sub(10, 2);
		calc.sum(2,5);

	}

}
