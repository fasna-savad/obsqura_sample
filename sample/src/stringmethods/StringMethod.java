package stringmethods;

public class StringMethod {
    // lenght()
	public static void main(String[] args) {
	String s ="JAVA";
	System.out.println(s.length());
	
	// equals()
	String s1 = "java";
	String s2 = "Java";
	String s3 = "java";
	System.out.println(s1.equals(s2)); // false
	System.out.println(s1.equals(s3)); //true

	//equalsIgnoreCase();
	System.out.println(s1.equalsIgnoreCase(s2)); // true
	System.out.println(s2.equalsIgnoreCase(s3)); //true


	}

}
