package encapsulation;

public class Encapsulation {

	private int a,b;
	
	public void setdata(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void getdata() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setdata(11,21);
		e.getdata();
		
		
	}

}
