package exceptionhandling;

public class Exception_handling {

	public static void main(String[] args) {
		try {
		int a=100;
		int num = a/0 ;
		System.out.println(num);
		}
		/*
		catch(ArithmeticException ari) { //ari is reference
		System.out.println(ari);
		}*/
		
		//if the exception is unknown
		catch(Exception exc) {
			System.out.println(exc);
		}
		
		finally {    //enth vannalum ee blok executeaavum
			System.out.println("hello world");
		}
		
	
	}

}
