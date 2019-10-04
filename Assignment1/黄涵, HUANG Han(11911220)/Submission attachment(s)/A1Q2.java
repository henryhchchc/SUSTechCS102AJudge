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
        int dm;
        int ds;
        int Ts = 0;

        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();

        if(s1 > s2){
            Ts += (s2+60)-s1;
            m2 -= 1;
        }
        else{
            Ts += s2 - s1;
        }

        if(m1 > m2){
            Ts += (m2+60)-m1;
            h2 -= 1;
        }
        else{
            Ts += (m2-m1)*60;
        }

        Ts += (h2-h1)*3600;

        dm = Ts / 60;
        ds = Ts % 60;

        if(dm != 0 && ds != 0 )
            System.out.printf("%dm%ds",dm, ds);
        if(dm == 0 && ds == 0)
            System.out.printf("0s");
        if(dm != 0 && ds == 0)
            System.out.printf("%dm",dm);
        if(dm == 0 && ds != 0)
            System.out.printf("%ds",ds);










    }
}
