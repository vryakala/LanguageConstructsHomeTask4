package homeTask4;

import java.util.Scanner;

public class NoOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 10-99");
		int a = scanner.nextInt();
		System.out.println("Enter a number between 10-99");
		int b = scanner.nextInt();
		scanner.close();
		if (a > 0 & b > 0) {
			int i = sumLimit(a, b);
			System.out.println(i);
		} else
			System.out.println("Enter Positive Numbers only");
	}

	private static int sumLimit(int a, int b) {
		String str1 = Integer.toString(a);
		int l1 = str1.length();
		int c = a + b;
		String str3 = Integer.toString(c);
		int l3 = str3.length();
		if (l3 > l1)
			return a;
		else
			return c;
	}
}
