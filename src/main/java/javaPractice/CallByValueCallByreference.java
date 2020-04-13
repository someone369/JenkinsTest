package javaPractice;

public class CallByValueCallByreference {
			
	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValueCallByreference obj = new CallByValueCallByreference();
		
		int x= 10;
		int y = 20;
		obj.sum(x, y); // This is call by value or pass by value
		
		/*
		This is call by reference which means we calling with the reference of
		object referene variable in indirect way
		*/
		
		obj.p = 50;
		obj.q = 10;
		
		System.out.print("Before swap value of P is : "+obj.p+" ");
		System.out.println("Before swap value of q is : "+obj.q);
		
		obj.swap(obj);
		
	}
	
	/*
	 * This is call by value or pass by value
	 */
	public int sum(int a, int b){
		a = 20;
		b = 30;
		int c = a+b;
		System.out.println("VAlue of the C is : "+c);
		return c;
	}
	
	/*
	 * This is call by reference which means we calling with the reference of
		object reference variable in indirect way
	 *  Here both the references of object is "obj", "k" are referring to the same object
	 */
	public void swap(CallByValueCallByreference k){
		
		int temp;
		temp = k.p;
		k.p = k.q;
		k.q = temp;
		
		System.out.print("After swap value of P is : "+k.p+" ");
		System.out.println("After swap value of q is : "+k.q);
		
	}

}
