

import java.util.Scanner;

public class A1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		System.out.printf("Enter the present time:  hh  mm  ss");
		int h = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
//  	System.out.printf("Enter the time you walk in:  hh  mm  ss");
		int hh = in.nextInt();
		int mm = in.nextInt();
		int ss = in.nextInt();
		int minute = (hh*60+mm)-(h*60+m);
		int second;
		if (s>ss) {
			minute = minute-1;
			second = ss-s+60;
		}else
			second = ss-s;
		if (minute*second==0) {
			if (minute == 0)
				System.out.printf("%ss",second);
			else
				System.out.printf("%sm",minute);
		}else
			System.out.printf("%sm%ss",minute,second);
		in.close();
	}

}
