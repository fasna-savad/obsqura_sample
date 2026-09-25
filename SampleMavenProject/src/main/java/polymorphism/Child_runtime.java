package polymorphism;

public class Child_runtime extends Parent_runtime{
	
	public void sum(int a , int b) {
		super.sum(2,2);//parent
		int c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		//upcasting
		 Parent_runtime p = new  Child_runtime();
		 p.sum(1,0);//child
		 
		 //inheritance
		 Child_runtime q =new Child_runtime();
		 q.sum(5, 5);//child
		 
	
		
		

	}

}
