import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1=input.nextInt();
        int m1=input.nextInt();
        int s1=input.nextInt();
        int h2=input.nextInt();
        int m2=input.nextInt();
        int s2=input.nextInt();
        int t=(h2-h1)*3600+(m2-m1)*60+s2-s1;
        int m=t/60;
        int s=t-60*m;
        if(m!=0) System.out.printf("%sm",m);
        if(s!=0) System.out.printf("%ss",s);
        else if(m==0) System.out.printf("0s");

    }
}
