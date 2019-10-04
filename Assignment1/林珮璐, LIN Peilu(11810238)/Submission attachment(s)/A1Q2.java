import java.util.Scanner;

public class A1Q2 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in); 
		int startHours = in.nextInt();
		int startMinutes = in.nextInt();
		int startSeconds = in.nextInt();

		int finishHours = in.nextInt();
		int finishMinutes = in.nextInt();
		int finishSeconds = in.nextInt();

		int waitHours;
		int waitMinutes;
		int waitSeconds;

		if (finishMinutes >= startMinutes) {
			waitHours = finishHours - startHours;

			if (finishSeconds >= startSeconds) {
				waitMinutes = finishMinutes - startMinutes;
				waitSeconds = finishSeconds - startSeconds;
			} else {
				waitMinutes = finishMinutes - startMinutes - 1;
				waitSeconds = finishSeconds + (60 - startSeconds);
			}

		} else {
			waitHours = finishHours - startHours - 1;

			if (finishSeconds >= startSeconds) {
				waitMinutes = finishMinutes + (60 - startMinutes);
				waitSeconds = finishSeconds - startSeconds;
			} else {
				waitMinutes = finishMinutes + (60 - startMinutes) - 1;
				waitSeconds = finishSeconds + (60 - startSeconds) - 1;
			}

		}

		int totalWaitMinutes = 60 * waitHours + waitMinutes;
		if (waitSeconds == 0) {
			if (totalWaitMinutes == 0) {
				System.out.println("0s");
			} else {
				System.out.println(totalWaitMinutes + "m");
			}
		} else {
			if (totalWaitMinutes == 0) {
				System.out.println(waitSeconds + "s");
			} else {
				System.out.println(totalWaitMinutes + "m" + waitSeconds + "s");
			}
		}
	}
}
