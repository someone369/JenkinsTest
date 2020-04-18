package collectionsJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
			
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Selenium");
		ll.add("Qtp");
		ll.add("Rft");
		System.out.println(ll);
		
		System.out.println("************************************");
		
		ll.addFirst("Chanti");
		ll.addLast("Chinni");
		
		System.out.println(ll);	
		System.out.println(ll.get(1));
		
		ll.set(1, "Selenium Testing");
		
		System.out.println(ll.get(1));
		
		ll.remove(0); // (or) ll.removeFirst();
		System.out.println(ll);
		
		ll.addFirst("Chanti");
		ll.add(1, "Schivaalayam");
		
		System.out.println(ll);
		
		// How many types we can retrieve the data from linkedlist object
		
		//for loop
		System.out.println();
		System.out.println("**************** using for loop");
		for(int i = 0; i<ll.size(); i++){
			System.out.println(ll.get(i));
		}
		
		// for each loop
		System.out.println("**************** using for each loop");
		
		for(String str : ll){
			System.out.println(str);
		}
		
		// using iterator
		System.out.println("**************** using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		// using while loop
		System.out.println("**************** using while loop");
		int n =0;
		while(n <ll.size()){
			System.out.println(ll.get(n));
			n++;
		}
	}

}
