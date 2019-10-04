import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h,hh,m,mm,s,ss;
        h = input.nextInt();
        m = input.nextInt();
        s = input.nextInt();
        hh = input.nextInt();
        mm = input.nextInt();
        ss = input.nextInt();
        h = hh-h;
        m = mm-m;
        s = ss-s;
        if (s<0){s=s+60;m--;}
        m += h*60;
        if (m!=0) System.out.printf("%dm",m);
        if (s!=0) System.out.printf("%ds",s);
        if (m == 0 & s == 0) System.out.print("0s");
    }
}