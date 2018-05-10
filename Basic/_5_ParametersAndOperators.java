
public class _5_ParametersAndOperators {
	static int result;
	public static void main(String[] args) {

		int firstNumber = 1, secondNumber = 2;
		SumTwoIntegers(firstNumber, secondNumber);
		System.out.println(result);
	}

	public static int SumTwoIntegers(int firstNumber, int secondNumber) {
		 result = firstNumber + secondNumber;
		
		return result;
	}

}
