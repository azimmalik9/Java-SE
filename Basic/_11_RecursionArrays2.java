
public class _11_RecursionArrays2 {

	public static void main(String[] args) {
		int test = 10;
		int[] intarray = new int[test];

		for (int i = 1; i < intarray.length; i++) {
			intarray[i] = i;
			System.out.print(intarray[i] + ",");
		}
		System.out.println();
		for (int i = 1; i < intarray.length; i++) {
			System.out.print(intarray[i] * 10 + ",");
		}
	}
}
