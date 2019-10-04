import java.util.Scanner;

public class A1Q2 {
    public static void main (String[] args ) {
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    int c;
    int x;
    int y;
    int z;
    int w;
    int e;
    int number1;
    int number2;
    int number3;
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
    x=input.nextInt();
    y=input.nextInt();
    z=input.nextInt();

    number1=3600*a+60*b+c;
    number2=3600*x+60*y+z;
    number3=number2-number1;
    w=number3/60;
    e=number3%60;
    if (w==0)System.out.printf("%ds",e);
    else {if (e==0)System.out.printf("%dm",w);
    else System.out.printf("%dm%ds",w,e);}





    }
}
