package homeTask4;

import java.util.Scanner;

public class TeaAndCandyParty {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Tea Amount");
		int tea = scanner.nextInt();
		System.out.println("Enter Candy Amount");
		int candy = scanner.nextInt();
		scanner.close();
		int i = teaParty(tea, candy);
		System.out.println(i);
	}

	private static int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5)
			return 0;
		if (tea >= 5 || candy >= 5) {
			if (tea >= (2 * candy) || candy >= (2 * tea))
				return 2;
			return 1;
		}

		return candy;
	}

}
