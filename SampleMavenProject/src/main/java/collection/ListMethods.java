package collection;

import java.util.LinkedList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<Integer> s=new LinkedList<Integer>();
		s.add(5);
		s.add(10);
		s.add(15);
		s.add(20);
		System.out.println(s);
		
		System.out.println(s.get(2));
		
		s.set(3, 100);
		System.out.println(s);
		
		System.out.println(s.size());
		
		System.out.println(s.isEmpty());
		
		s.remove(0);
		System.out.println(s);
		
		System.out.println(s.contains(10));
		System.out.println(s.contains(1011));
		
		System.out.println(s.indexOf(15));
		
		System.out.println(s.lastIndexOf(15));
		
		s.add(15);
		System.out.println(s);
		System.out.println(s.lastIndexOf(15));
		
		
	}

}
