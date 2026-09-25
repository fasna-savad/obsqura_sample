package exceptionhandling;

public class Multiple_exception {

	public static void main(String[] args) {
		try {
			int a[]= new int[4];
			a[4]=8/0;                  //rightside will be executed first,so thats y only arithmetiexception is displaying
			}
		catch(ArithmeticException ari) {
			System.out.println(ari);
			
		}
		catch(ArrayIndexOutOfBoundsException array) {
			System.out.println("invalid index value");
		}
		
	}

}
