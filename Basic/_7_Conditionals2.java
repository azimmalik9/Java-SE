
public class _7_Conditionals2 {
	static int result;

	public static void main(String[] args) {

		int firstNumber = 9, secondNumber = 0;
		boolean decision = true;

		SumTwoIntegers(firstNumber, secondNumber, decision);
		System.out.println(result);
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
