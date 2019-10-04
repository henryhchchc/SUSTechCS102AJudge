package Assignment;
import java.util.Scanner;
public class A1Q2 {
    public static void main(String []args){
        int t1, t2, t3, t4, t5, t6, m, s;

        Scanner input = new Scanner(System.in);
        System.out.print("");
        t1 = input.nextInt();
        t2 = input.nextInt();
        t3 = input.nextInt();
        t4 = input.nextInt();
        t5 = input.nextInt();
        t6 = input.nextInt();

        m = 60*(t4-t1) + (t5-t2);
        s = t6-t3;

        while(s < 0){
            m = m - 1;
            s = s + 60;}
        while(s >= 60){
            m = m + 1;
            s = s - 60; }

        if(m == 0 )
            System.out.printf("%ds",s);
        else if (s == 0)
            System.out.printf("%dm",m);
        else{
            System.out.printf("%dm%ds",m,s);
        }
    }
}
