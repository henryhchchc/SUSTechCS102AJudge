import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1;
        int m1;
        int s1;

        int h2;
        int m2;
        int s2;

        int t;

        int m;
        int s;

        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();

        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();

        t =  h2*3600 + m2*60 + s2 - h1*3600 - m1*60 - s1 ;

        m = t/60 ;
        s = t%60 ;

        if( t == 0)
            System.out.println("0s");
        else if( s == 0 )
            System.out.printf("%dm",m);
        else if( m == 0 )
            System.out.printf("%ds",s);
        else
            System.out.printf("%dm%ds",m,s);


        }
    }
