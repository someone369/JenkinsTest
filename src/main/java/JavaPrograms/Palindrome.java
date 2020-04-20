package JavaPrograms;

public class Palindrome {

	public static void ispalindrome(int num) {
		
		int reminder = 0;
		int sum = 0;
		int temporary;

		temporary = num;
		while (num > 0) {
			reminder = num % 10;
			sum = (sum * 10) + reminder;
			num = num / 10;
		}

		if (temporary == sum) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not a palindrome number");
		}
	}

	public static void main(String[] args) {
		ispalindrome(5);
	}

}
