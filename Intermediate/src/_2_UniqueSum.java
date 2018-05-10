import java.util.Scanner;

public class _2_UniqueSum {

	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		int result;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");

		number1 = s.nextInt();

		System.out.println("Enter second number:");

		number2 = s.nextInt();

		System.out.println("Enter thrid number:");

		number3 = s.nextInt();

		if (number1 == number2 && number2 == number3) {
			result = 0;
		} else if (number1 == number2) {
			result = 0 + number3;
		} else if (number2 == number3) {
			result = 0 + number1;
		} else if (number3 == number1) {
			result = 0 + number2;
		} else {
			result = number1 + number2 + number3;
		}
		
		System.out.println(result);
	}

}
