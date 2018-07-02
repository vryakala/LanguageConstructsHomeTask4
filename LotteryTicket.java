package homeTask4;

import java.util.Scanner;

public class LotteryTicket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number");
		int b = scanner.nextInt();
		System.out.println("Enter Third Number");
		int c = scanner.nextInt();
		scanner.close();
		int i = ticket(a, b, c);
		System.out.println(i);
	}

	private static int ticket(int a, int b, int c) {
		if ((a + b) == 10 || (b + c) == 10 || (a + c) == 10) {
			return 10;
		}
		if ((a + b) == (b + c + 10) || (a + b) == (a + c + 10)) {
			return 5;
		} else
			return 0;

	}
}
