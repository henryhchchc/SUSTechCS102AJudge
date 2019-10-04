
public class A1Q4 {
	public static void main(String[] args) {
		int length = args.length;
		int amount = 0;
		int amount1 = 0;
		int total = 0;
		int large = Integer.parseInt(args[0]);
		
		for (amount = 0; amount < length; amount++) {
			total += Integer.parseInt(args[amount]);
		}
		
		for (amount1 = 0; amount1 < length - 1; amount1++) {
			if (large <= Integer.parseInt(args[amount1 + 1])) {
				large = Integer.parseInt(args[amount1 + 1]);
			}
		}

		if (large >= 8000 || (length >= 10 && total >= 5000)) {
			System.out.println("Diamond");

		} else {
			if (large >= 3000 || (length >= 5 && total >= 2000)) {
				System.out.println("Gold");

			} else {
				if (large >= 1000 || (length >= 2 && total >= 800)) {
					System.out.println("Silver");

				}
			}
		}
	}
}
