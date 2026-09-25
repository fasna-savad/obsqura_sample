package exceptionhandling;

public class Throws_keyword {

	public static void main(String[] args) throws VotingException { //declaring the exception
													//right click on VotingException, click on create class 
		int age=10;
		if(age >=18) {
		System.out.println("eligible to vote");	
		}
		else {
			throw new VotingException("not eligible to vote");
		}

	}

}
