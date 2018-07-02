package homeTask4;

import java.util.Scanner;

public class ShareSameDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 10-99");
		int a = scanner.nextInt();
		System.out.println("Enter a number between 10-99");
		int b = scanner.nextInt();
		scanner.close();
		boolean i = false;
		if (a < 10 || a > 99 || b < 10 || b > 99)
			i = shareDigit(a, b);
		else
			System.out.println("Enters Numbers between 10-99");
		System.out.println(i);
	}

	private static boolean shareDigit(int a, int b) {
		if ((a / 10) == (b / 10) || (a / 10) == (b % 10) || (a % 10) == (b / 10) || (a % 10) == (b % 10))
			return true;
		else
			return false;
	}

}
