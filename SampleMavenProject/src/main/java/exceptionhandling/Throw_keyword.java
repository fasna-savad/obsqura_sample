package exceptionhandling;

public class Throw_keyword {
	public static void main(String[] args) {
		int age=10;
		if(age >=18) {
		System.out.println("eligible to vote");	
		}
		else {
			throw new ArithmeticException("not eligible to vote");
		}
		}
}
