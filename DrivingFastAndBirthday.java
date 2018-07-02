package homeTask4;

import java.util.Scanner;

public class DrivingFastAndBirthday {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int speed = scanner.nextInt();
		boolean birthday = scanner.nextBoolean();
		scanner.close();
		int i = caughtSpeeding(speed, birthday);
		System.out.println(i);
	}

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday) {
			if (speed <= 65)
				return 0;
			if (speed > 65 & speed <= 85)
				return 1;
			if (speed > 85)
				return 2;
		} else {
			if (speed <= 60)
				return 0;
			if (speed > 60 & speed <= 80)
				return 1;
			if (speed > 80)
				return 2;
		}
		return speed;
	}
}
