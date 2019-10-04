import java.util.Scanner;
public class A1Q2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		for (int i = 0; i < a.length; i++) {

			a[i] = input.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = input.nextInt();
		}
		int  m, s, sa, sb;
		sa = a[0] * 3600 + a[1] * 60 + a[2];
		sb = b[0] * 3600 + b[1] * 60 + b[2];
		s = sb - sa;
		m = s / 60;
		s -= m * 60;
		if (m == 0&&s==0) System.out.println( s + "s");
		else if(m==0) System.out.println( s + "s");
		else if(s==0) System.out.println( m + "m");
		else System.out.println( m + "m" + s + "s");

	}
}
