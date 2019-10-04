import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int s1 = input.nextInt();
        int h2 = input.nextInt();
        int m2 = input.nextInt();
        int s2 = input.nextInt();
        int ds;
        ds = 3600*h2 + 60*m2 + s2 - 3600*h1 - 60*m1 - s1;
        int dm;
        dm = ds / 60;
        int dss;
        dss = ds - dm * 60;
        if(dm != 0){
            System.out.printf("%dm",dm);
        }
        if(dss != 0){
            System.out.printf("%ds",dss);
        }
        if(dm == 0 && ds == 0){
            System.out.println("0s");
        }

    }
}
