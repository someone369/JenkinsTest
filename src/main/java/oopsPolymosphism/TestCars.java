package oopsPolymosphism;

public class TestCars {

	public static void main(String[] args) {
			
		Bmw b = new Bmw();
		
		/*Here comes the method overriding concept
		when same name of method is present in the parent class and child class with the same orguments is 
		method overriding*/
		
		b.start();
		//here this start method is present in the parent as well as child but JVM prefers the child class method only
		// This is called Static Polymorphism (or) compile time Polymorphism
		b.stop(); 
		b.refule();
		b.theftSafty();
		b.engine();
		
		System.out.println("**************************");
		
		Car c = new Car();
		c.start();
		// here with the parent class reference variable we can call parent class method only not child class method
		c.stop();
		c.refule();
		c.engine();// this method comes from vehicle class
		
		System.out.println("***********************");
		
		// Top Casting
		Car c1 = new Bmw();// This concept is call dynamic polymorphism
		c1.start();
		// with the dynamic poymorphism we can only access overriding methods not other methods
		c1.stop();
		c1.refule();
		c1.engine();
		
		System.out.println("***************************");
		
		//Down Casting
		Bmw b1 = (Bmw) new Car();
		// Down casting can not be allowed it will give us exception classCastException
	}

}
