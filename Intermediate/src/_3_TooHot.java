import java.util.Scanner;

public class _3_TooHot {

	public static void main(String[] args) {
		int temperature = 0;
		boolean isSummer = false;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature:");

		temperature = s.nextInt();

		if (temperature >= 60 && temperature <= 90) {
			System.out.println(isSummer);
		}
		else if (temperature >= 60 && temperature <= 100) {
			isSummer = true;
			System.out.println(isSummer);
		}
		else
			System.out.println(isSummer);

	}

}
