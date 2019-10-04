public class A1Q1 {
	public static void main(String[] args) {
		String name = args[0];
		int num = Integer.parseInt(args[1]);
		int a;
		a = num / 100000 - 115;
		if (a >= 0 && a <= 4) {
			System.out.printf("%s, welocome to SUSTECH Hot Pot Restaurant!",name);
			}
		else {
			System.out.print(num);
		}
	}
}
