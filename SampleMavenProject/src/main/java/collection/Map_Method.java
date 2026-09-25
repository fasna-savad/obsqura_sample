package collection;

import java.util.HashMap;
import java.util.Map;

public class Map_Method {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(30, "Fasna");
		m.put(10, "Adhil");
		m.put(20, "Ashi");
		m.put(40, "Safwan");
		m.put(50, "Savad");
		m.put(60, "Saira");
		System.out.println(m);

		System.out.println(m.get(10));
		System.out.println(m.get(1));
		System.out.println(m.get("Fasna")); //get is based on key
		
		m.remove(60);
		System.out.println(m);
		
		System.out.println(m.containsKey(15)); 
		System.out.println(m.containsKey(10));//checking if the key is present

	}

}
