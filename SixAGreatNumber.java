package homeTask4;

import java.util.Scanner;

public class SixAGreatNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scanner.nextInt();

		System.out.println("Enter Second Number");
		int b = scanner.nextInt();
		scanner.close();
		if (a == 6 || b == 6 || (a - b) == 6 || (a + b) == 6) {
			System.out.println("true");
		} else
			System.out.println("false");
	}

}
