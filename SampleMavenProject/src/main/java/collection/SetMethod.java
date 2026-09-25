package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethod {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>(); //set1
		s1.add(1);  //adding elements
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		
		Set<Integer> s2 = new HashSet<Integer>(); //set2
		s2.add(6);
		s2.add(7);
		s2.add(8);
		s2.add(9);
		s2.add(10);
		
		System.out.println(s1);
		System.out.println(s2);	
		
		s1.addAll(s2);
		System.out.println(s1);  //adding elements in set2 to set1
		System.out.println(s2);
		

		System.out.println(s1.size());  //size of s1
		System.out.println(s2.size());  //size of s2
		
		System.out.println(s1.isEmpty());  //checking if s1 is empty
		
		System.out.println(s1.contains(2));  //checking if s1 has element 2
		System.out.println(s1.contains(22));  
		
		System.out.println(s2.containsAll(s1)); //checking if s1 has s2
		System.out.println(s1.containsAll(s2));
		
		s1.remove(3);
		System.out.println(s1); //removed 3 from s1
		
		s1.removeAll(s2); //removed s2 from s1
		System.out.println(s1);
		
		s2.clear();
		System.out.println(s2); //cleared s2

		
	}

}

//set-no duplicates will be printed