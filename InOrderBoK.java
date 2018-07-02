package homeTask4;

import java.util.Scanner;

public class InOrderBoK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number");
		int b = scanner.nextInt();
		System.out.println("Enter Third Number");
		int c = scanner.nextInt();
		System.out.println("Enter bOk");
		boolean bOk = scanner.nextBoolean();
		scanner.close();
		boolean i = inOrder(a, b, c, bOk);
		System.out.println(i);
	}

	private static boolean inOrder(int a, int b, int c, boolean bOk) {
		if (c > b)
			if (bOk == true)
				return true;

		if (c > b)
			if (b > a)
				return true;

		return false;
	}
}
