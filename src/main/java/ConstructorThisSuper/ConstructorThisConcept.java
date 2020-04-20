package ConstructorThisSuper;

public class ConstructorThisConcept {
		int age;
		String name;
		String occupation;
		
	public ConstructorThisConcept(int age, String name){
		this.age = age;
		this.name = name;
		occupation = "Selenium Tester";
		
		System.out.println("Age of the person is : "+age);
		System.out.println("Name of the person is : "+name);
	}
	
	public static void main(String[] args) {
		ConstructorThisConcept ctc = new ConstructorThisConcept(28, "Lakshmi Narasimham");
		
		System.out.println(ctc.age);
		System.out.println(ctc.name);
	}
}
