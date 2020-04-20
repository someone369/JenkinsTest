package JavaPrograms;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void primeSeries(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
		System.out.println("Total prime numbers beteen " + num);
	}

	public static void main(String[] args) {
		/*boolean primeStatus = isPrime(12);
		System.out.println("Prime number status of the given number is : " + primeStatus);*/

		primeSeries(100);
		System.out.println();
	}

}
