package collectionsJava;

import ConstructorThisSuper.ConstructorSuperA;

public class ConstructorSuperb extends ConstructorSuperA{
	
	public ConstructorSuperb(){
		super(10);
		System.out.println("Child class default class constructor");
	}

	public static void main(String[] args) {
		ConstructorSuperb csb = new ConstructorSuperb();
		
	}

}
