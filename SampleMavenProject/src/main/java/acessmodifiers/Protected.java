package acessmodifiers;

public class Protected {
	
	protected void sum(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Protected m = new Protected();
		m.sum(2, 2);
	}

}
