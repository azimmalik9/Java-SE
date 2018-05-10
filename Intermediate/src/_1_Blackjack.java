import java.util.Scanner;

public class _1_Blackjack {
	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");

		number1 = s.nextInt();

		System.out.println("Enter second number:");

		number2 = s.nextInt();

		if (number1 <= 21 && number2 <= 21) {
			if (number1 > 0 && number2 > 0) {
				if (number1 < number2) {
					System.out.println(number2);
				}
				if (number2 < number1) {
					System.out.println(number1);
				}
			}
		} else {
			System.out.println(0);
		}
		// System.out.println("Hi " + number1 + "and "+ number2);

	}
}
