
public class _9_Arrays {
	static int result;

	public static void main(String[] args) {

		int firstNumber = 9, secondNumber = 9;
		boolean decision = false;

		int[] arrayOfInts = new int[10];
		arrayOfInts[0] = 1;
		arrayOfInts[1] = 2;
		arrayOfInts[2] = 3;
		arrayOfInts[3] = 4;
		arrayOfInts[4] = 5;
		arrayOfInts[5] = 6;
		arrayOfInts[6] = 7;
		arrayOfInts[7] = 8;
		arrayOfInts[8] = 9;
		arrayOfInts[9] = 10;

		for (int i : arrayOfInts) {
			System.out.println(i + "- " + _7_Conditionals2.SumTwoIntegers(firstNumber, secondNumber, decision));
		}

	}
}
