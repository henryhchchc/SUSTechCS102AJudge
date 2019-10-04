import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner g = new Scanner(System.in);
        int h1,m1,s1,h2,m2,s2,a;

        h1 = g.nextInt();
        m1 = g.nextInt();
        s1 = g.nextInt();

        h2 = g.nextInt();
        m2 = g.nextInt();
        s2 = g.nextInt();
        if(s1>s2)
            a = (h2 - h1) * 60 + m2 -m1 - 1;
        else
            a = (h2 - h1) * 60 + m2 -m1;
        int b = ((m2 - m1) * 60 + s2 -s1) % 60;
        if(a == 0)
            System.out.printf("%ds",b);
        else if( b == 0)
            System.out.printf("%dm",a);
        else
            System.out.printf("%dm%ds",a,b);

    }
}