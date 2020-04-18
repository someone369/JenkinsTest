package collectionsJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		int array[] = new int [3];// this is the static array we can not modify the size once we declared the size
		// to overcome this java collections came in to picture/
		
		ArrayList al = new ArrayList();
		// This is with unlimited size
		al.add("Lakshmi");
		al.add(12);
		al.add('c');
		System.out.println("Size of the array is : "+ al.size());
		
		System.out.println(al);
		System.out.println(al.toString());
		
		// Internally the above statements are same
		// because JVM internally calls to string method
		System.out.println("*********************************");
		for(int i= 0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		
		System.out.println("*********************************");
		ArrayList al1 = new ArrayList();
		// it is showing yellow colored warning because we declared collection objects with out generic
		// Generic is nothing but declaring the data type of the array object
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Narasimham");
		al2.add("Prasanth");
		al2.add("Jagadeesh");
		System.out.println(al2.get(2));
		
		for(int i= 0; i<al2.size(); i++){
			System.out.println(al2.get(i));
		}
		
		al2.set(2, "Perugu");
		System.out.println(al2.get(2));
		System.out.println("---------------");
		for(int i= 0; i<al2.size(); i++){
			System.out.println(al2.get(i));
		}
		
		System.out.println("*********************************");
		
		Person pr = new Person("Santhosh", 28, "DB developper");
		Person pr1 = new Person("Nagesh", 28, "Port Employee");
		Person pr2 = new Person("Balu ", 28, "Port Employee");
		
		ArrayList<Person> al3 = new ArrayList<Person>();
		al3.add(pr);
		al3.add(pr1);
		al3.add(pr2);
		
		Iterator<Person> it = al3.iterator();
		
		while(it.hasNext()){
				Person per = it.next();
				/*Person age = it.next();
				Person occupation = it.next();*/
				System.out.println("name is : "+per.name);
				System.out.println("age is : "+per.age);
				System.out.println("occupation is : "+per.occupation);
		}
		
		System.out.println("*********************************");
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("Narasimham");
		al4.add("Prasanth");
		al4.add("Jagadeesh");
		
		ArrayList<String> al5 = new ArrayList<String>();
		al5.add("Santosh gadu");
		al5.add("Nagesh gadu");
		al5.add("Balu gadu");
		
		al4.addAll(al5);
		
		for(int i= 0; i<al4.size(); i++){
			System.out.println(al4.get(i));
		}
		
		System.out.println("*********************************");
		
		ArrayList<String> al6 = new ArrayList<String>();
		al6.add("Name 1");
		al6.add("Name 2");
		al6.add("Name 3");
		
		ArrayList<String> al7 = new ArrayList<String>();
		al7.add("Name 1");
		al7.add("Nagesh gadu");
		al7.add("Balu gadu");
		
		al6.retainAll(al7);
		
		for(int i= 0; i<al6.size(); i++){
			System.out.println(al6.get(i));
		}
	}

}
