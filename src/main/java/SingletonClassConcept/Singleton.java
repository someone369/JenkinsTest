package SingletonClassConcept;

public class Singleton {

	/*
	 * Singleton class has only one object (instance of the class) at a time To
	 * design Singleton Class : 1. make constructor as private 2. Write public
	 * static method (getInstance)thats return type should be class type return
	 * type
	 */

	private static Singleton Singleton_reference = null;
	public String str;

	private Singleton() {

		str = "I am a profrssional Software Tester";
	}

	public static Singleton getInstance() {
		if (Singleton_reference == null)
			Singleton_reference = new Singleton();
		return Singleton_reference;
	}

	public static void main(String[] args) {
		Singleton A = Singleton.getInstance();
		Singleton B = Singleton.getInstance();
		Singleton C = Singleton.getInstance();

		A.str = (A.str).toUpperCase();

		System.out.println(A.str);
		System.out.println(B.str);
		System.out.println(C.str);
		
		
		System.out.println("********************************");

		C.str = (A.str).toLowerCase();

		System.out.println(A.str);
		System.out.println(B.str);
		System.out.println(C.str);
	}

}
