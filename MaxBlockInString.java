package homeTask4;

import java.util.Scanner;

public class MaxBlockInString {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scanner.nextLine();
		scanner.close();
		int max = maxBlock(str);
		System.out.println(max);
	}

	private static int maxBlock(String str) {
		int i = 0;
		int j = 0;
		int k = 1;
		int max = 1;
		if (str == "") {
			return 0;
		} else {
			for (i = 0; i < str.length(); i++) {
				for (j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						k++;
						if (k > max)
							max = k;
					} else {
						k = 1;
						break;
					}
				}
				if (j == str.length())
					break;
			}
			return max;
		}
	}
}
