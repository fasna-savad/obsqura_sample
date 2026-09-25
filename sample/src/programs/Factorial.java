package programs;

public class Factorial {
	
	public static int calc(int num) {
		int fact=1;
		for (int i= num; i>=1;i--) {
			 fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int number=5;
		int result=calc(number);
		System.out.println("factorial of " + number +" is " +result);
		
	}

}

