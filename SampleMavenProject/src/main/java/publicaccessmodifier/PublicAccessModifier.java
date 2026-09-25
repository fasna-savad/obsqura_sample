package publicaccessmodifier;

public class PublicAccessModifier {
	public void sum (int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		PublicAccessModifier object = new PublicAccessModifier();
		object.sum(3, 3);
	}

}
//created public class,executed in same class