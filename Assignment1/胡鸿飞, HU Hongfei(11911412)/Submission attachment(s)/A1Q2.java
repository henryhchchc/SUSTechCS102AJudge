import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        int h1,m1,s1,h2,m2,s2,trans1,trans2,minus1,waitsec,waitmin;
        Scanner scan=new Scanner(System.in);
        h1=scan.nextInt();
        m1=scan.nextInt();
        s1=scan.nextInt();
        h2=scan.nextInt();
        m2=scan.nextInt();
        s2=scan.nextInt();
        trans1 = h1 * 3600 + m1 * 60 + s1;
        trans2 = h2 * 3600 + m2 * 60 + s2;
        minus1 = trans2 - trans1;
        waitsec = minus1 % 60;
        waitmin = (minus1 - waitsec) / 60;

        System.out.printf("%d %d %d\n", h1, m1, s1);
        System.out.printf("%d %d %d\n", h2, m2, s2);
        System.out.printf("%d m %d s\n", waitmin, waitsec);

        }
        }

    }
}
