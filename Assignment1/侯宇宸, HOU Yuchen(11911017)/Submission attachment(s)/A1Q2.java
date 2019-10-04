import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        Scanner time=new Scanner(System.in);
        int h1=time.nextInt();
        int m1=time.nextInt();
        int s1=time.nextInt();
        int h2=time.nextInt();
        int m2=time.nextInt();
        int s2=time.nextInt();
        int a=h1*3600+m1*60+s1;
        int b=h2*3600+m2*60+s2;
        int c=b-a;
        int d=c/60;
        int e=c%60;
        System.out.printf("%sm%ss",d,e);
    }
}
