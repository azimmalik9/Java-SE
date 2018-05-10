
public class _6_Conditionals {
	static int result;

	public static void main(String[] args) {

		int firstNumber = 1, secondNumber = 2;
		boolean decision = true;

		SumTwoIntegers(firstNumber, secondNumber, decision);
		System.out.println(result);
	}

	public static int SumTwoIntegers(int firstNumber, int secondNumber, boolean decision) {
		if (decision)
			result = firstNumber + secondNumber;
		else
			result = firstNumber * secondNumber;

		return result;
	}
}
