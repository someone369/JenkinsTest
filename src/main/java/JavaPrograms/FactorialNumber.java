package JavaPrograms;


public class FactorialNumber {
	
	// with out recursion
	public static int factorial(int num) {

		int fact = 1;
			if(num==0)
				return 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;
	}
	
	// with recursion
	
	public static int factrl(int num){
		if (num==0)
			return 1;
		else
			return (num*factrl(num-1));
	}
	public static void main(String[] args) {
		//System.out.println("Factorial of the number is : "+factorial(10));
		
		System.out.println("Factorial of the number is : "+factrl(5));
	}
}
