
public class A1Q5 {
	public static void main(String[] args) {
		int m = 0;
		double i;
		int length = args.length;
		while (m <= length-1) {
			i = Double.parseDouble(args[m]);
			int i1 = (int) i;
			int a = i1 / 10;
			int b = (int) (i - 10 * a);
			int a1=a;
			int b1=b;
			if (a == 4||a==2||b==4||b==2) {
				if (a == 4) {
					a1 = 9;
				} else if (a == 2) {
					a1 = 6;
				}
				if (b == 4) {
					b1 = 9;
				} else if (b == 2) {
					b1 = 6;
				}

			}
			i=i-10*a-b+10*a1+b;
			System.out.printf("%d\n"  , i);
         m++;
		}
	}
}
