package stringmethods;

public class ClassStringBuilder {

	public static void main(String[] args) {
//reverse    
		StringBuilder s1 = new StringBuilder("fasna");
		s1.reverse();
		System.out.println(s1); //ansaf
		
//append		
		StringBuilder s2 = new StringBuilder("fasna ");
		s2.append("savad");
		System.out.println(s2);  //fasna savad
		
//insert
		StringBuilder s3 = new StringBuilder("fasna a savad ");
		s3.insert(7,"dhil");
		System.out.println(s3); // fasna adhil savad
		
//delete
		StringBuilder s4 = new StringBuilder("Mannat Fasna ");
		s4.delete(0, 7);
		System.out.println(s4); //Fasna
		
//replace
		StringBuilder s5 = new StringBuilder("FAASSNNAAA");
		s5.replace(1, 5, "   ");
		System.out.println(s5); // F   NNAAA

	}

}
