

import java.util.Scanner;

public class A1Q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int h1 = scan.nextInt();
		int m1 = scan.nextInt();
		int s1 = scan.nextInt();
		int h2 = scan.nextInt();
		int m2 = scan.nextInt();
		int s2 = scan.nextInt();
		int time = 0;
		int second = 0;
		int sum1 = (h2 - h1) * 3600 + (m2 - m1) * 60 + (s2 - s1);
		second = sum1 % 60;
		time = sum1 / 60;
		if (second == 0) {
			System.out.printf("%dm", time);
		} else if (time == 0) {
			System.out.printf("%ds", second);
		} else {
			System.out.printf("%dm%ds", time, second);
		}
	}

}
