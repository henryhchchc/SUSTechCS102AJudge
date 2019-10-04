import sun.util.resources.ga.LocaleNames_ga;

import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        int h1,h2,m1,m2,m,s1,s2,s,delta;
        Scanner input=new Scanner(System.in);

        h1=input.nextInt();
        m1=input.nextInt();
        s1=input.nextInt();
        h2=input.nextInt();
        m2=input.nextInt();
        s2=input.nextInt();

        delta=3600*(h2-h1)+60*(m2-m1)+s2-s1;

        m=delta/60;
        s=delta-60*m;

        if(m==0) {
            if (s == 0)
                System.out.print("0s");
            else
                System.out.printf("%ds", s);
        } else {
            if (s == 0)
                System.out.printf("%dm", m);
            else
                System.out.printf("%dm%ds", m, s);
        }



    }
}
