package stringmethods;

public class ClasStringBuffer {

	
	public static void main(String[] args) {
		
// reverse()		
  StringBuffer s = new StringBuffer("hello");
  s.reverse();
  System.out.println(s);
  
// append()
  StringBuffer s1 = new StringBuffer("hihello");
  s1.append("world");
  System.out.println(s1);
  
  // insert()
  StringBuffer s2 = new StringBuffer("hi hello");
  s2.insert(2,"earth");
  System.out.println(s2);

  //delete()
  StringBuffer s3 = new StringBuffer("fasnasavad");
  s3.delete(2, 8);
  System.out.println(s3);  //faad
  
 //replace()
  StringBuffer s4  = new StringBuffer("fasna savad");
  s4.replace(6, 10, "adhil");
  System.out.println(s4);  //fasna adhild

  
  
  
  
  
  
  
  
  
  
  
  
  
	}

}
