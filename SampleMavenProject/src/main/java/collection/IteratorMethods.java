package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorMethods {

	public static void main(String[] args) {
		List<Integer> k = new LinkedList<Integer>();
		k.add(1);
		k.add(2);
		k.add(3);
		k.add(4);
		k.add(5);
		System.out.println(k);

		Iterator<Integer> i =  k.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		i.remove();   //removed last element 5
		System.out.println(k);

		
	}

}
