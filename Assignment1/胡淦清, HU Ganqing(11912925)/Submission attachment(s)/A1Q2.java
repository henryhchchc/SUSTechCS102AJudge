import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int c;
        c = in.nextInt();
        int d;
        d = in.nextInt();
        int e;
        e = in.nextInt();
        int f;
        f = in.nextInt();
        if (60 * (d - a) + e - b == 0)
            System.out.println((f - c) + "s");
        else if(60 * (d - a) + e - b == 1&&f-c<0)
            System.out.println(60+f-c+"s");
        else if ((f - c) == 0)
            System.out.println(60 * (d - a) + e - b + "m");
        else if(f-c<0)
            System.out.println(60*(d-a)+e-b-1+"m"+((f-c)+60)+"s");
        else
            System.out.println(60 * (d - a) + e - b + "m" + (f - c) + "s");
        }    }