import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    	int h,m,s,hh,mm,ss,hhh,mmm,sss;
        h = input.nextInt();
		m = input.nextInt();
		s = input.nextInt();
		hh = input.nextInt();
		mm = input.nextInt();
		ss = input.nextInt();
hhh = hh - h;
mmm = mm - m;
sss = ss - s;
       sss += mmm*60 + hhh*3600;
       mmm = sss / 60;
       sss = sss % 60;
		
			if (mmm == 0 && sss == 0)
				System.out.println("0s");

			else if (mmm != 0 && sss == 0)
				System.out.println(mmm + "m");
			else if (mmm == 0 && sss != 0)
				System.out.println(sss + "s");
			else
				System.out.println(mmm + "m" + sss + "s");
    }
    
}