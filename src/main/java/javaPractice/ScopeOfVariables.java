package javaPractice;

public class ScopeOfVariables {
	
	/*
	
	* static methods can access only static variables not non-static
	
	* But non-static methods (or) instance methods can access any variables 
	  either static (or) instance
	  
	* To access non-static variables in main method we have to create object
	
	* To access static variables in main method no need to create object.
	  we can access them in a static way because main method is also a static method
	
	*/
	
	 String s= "Selenium";
	static int age = 28;
	static int score = 15;
	
	public static void main(String[] args) {
		
		ScopeOfVariables sc = new ScopeOfVariables();
		sc.sum();
		System.out.println("I am in main method : "+sc.s);
		test();
		int myAge = sc.age;
		System.out.println("My age is : "+myAge);
		System.out.println("My age is : "+age);
	}
	
	public void sum(){
		
		int total = age+score;
		System.out.println(total);
	}
	
	public static void test(){
		System.out.println("I m in test method : "+age);
	}
}
