import java.util.Scanner;

public class _12_Scanner {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int num = s.nextInt();

		int[] intarray = new int[num];

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
