package ConstructorThisSuper;

public class ConstructorSuperA {
	
	public ConstructorSuperA(){
		System.out.println("Parent class default constructor");
	}
	
	public ConstructorSuperA(int i){
		System.out.println("Parent class parameterised constructor");
		System.out.println("Value of i is : "+i);
	}

}
