import java.util.Scanner;

public class A2Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double price = 0;
		while (in.hasNext()) {
			double b = in.nextDouble();
			int a = ((int) b) % 10;
			if (a == 2) {
				System.out.printf("%s", "test");

			}
			if (a == 4) {
				System.out.printf(b + 5 + " ");

			}

		}

	}

	public static int[] test(int A, int B) {
		return null;
	}
}
