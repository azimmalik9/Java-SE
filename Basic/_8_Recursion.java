
public class _8_Recursion {
	static int result;

	public static void main(String[] args) {

		int firstNumber = 15, secondNumber = 0;
		boolean decision = true;

		SumTwoIntegers(firstNumber, secondNumber, decision);
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "-" + SumTwoIntegers(firstNumber, secondNumber, decision));
		}

	}

	public static int SumTwoIntegers(int firstNumber, int secondNumber, boolean decision) {
		if (decision)
			result = firstNumber + secondNumber;
		else
			result = firstNumber * secondNumber;

		if (firstNumber == 0) {
			return secondNumber;
		}

		return result;
	}
}
