package collectionsJava;

import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		/*
		 * In array list for adding values we use add method but in the hashtable 
		 * we use put methods in HashTable class
		 * HashTable class take values as key value pairs
		 */
		
		
		Hashtable ht = new Hashtable();
		
		ht.put("A", "Laka Laka");
		ht.put("B", "Chandra mukhi");
		ht.put("c", "Rajani kanth");
		
		System.out.println("Size of the array is : "+ht.size());
		
		Set<String> str = ht.keySet();
		
		for(String rt : str){
			System.out.println(rt);
		}
		
		Hashtable<String, String> ht1 = new Hashtable<String, String>();
		
		ht1.put("first", "firstvalue");
		ht1.put("second", "second value");
		ht1.put("third", "third value");
		
		Set<String> str1 = ht1.keySet();
		
		for(String rtr : str1){
			System.out.println(rtr);
		}
		
	}

}
