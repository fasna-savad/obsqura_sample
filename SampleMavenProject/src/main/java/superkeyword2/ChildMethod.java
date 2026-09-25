package superkeyword2;

public class ChildMethod extends ParentMethod{
	public void sum(int a ,int b) { //method overriding
		int sub = a-b;
		System.out.println("child method "+sub);
		super.sum(10, 10); //calling parent method using super keyword
	}

	public static void main(String[] args) {
		ChildMethod obj = new ChildMethod();
		obj.sum(12, 2);

	}

}
