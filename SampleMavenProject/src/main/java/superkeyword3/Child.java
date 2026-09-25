package superkeyword3;

public class Child extends Parent {
	public Child (int a,int b) {
		super(5,5);
		int sub=a-b;
		System.out.println("child constructor "+sub);
		
	}

	public static void main(String[] args) {
		Child cons = new Child(10,10);//child object created
		

	}

}
//child object is created -cons
//calls child constructor with a=10,b=10 
//calls parent constructor,prints
//prints child constructor
