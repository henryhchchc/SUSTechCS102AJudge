import java.util.Scanner;


public class A1Q3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double sum=0;
        {
            while (in.hasNext()) {
                double p = in.nextDouble();
                double q = in.nextDouble();
                int q2 = (int) q;
                double a1, a2, fp;
                {
                    if (q2 == q)
                        fp = p * q;
                    else {
                        a1 = q2 * p;
                        a2 = (p / 2 + 1) * 100;
                        int a3 = (int) a2;
                        int a4 = (a3 / 10) * 10;
                        int a5 = a3 - a4;
                        int a7 = (int) a2 / 10;
                        double a6 = (int) a7;
                        double a8 = a6 / 10;
                        double a9 = a8 + 0.1;
                        if (a5 < 5)
                            fp = a8 + a1;
                        else
                            fp = a9 + a1;
                    }
                }
                sum += fp;
            }
            System.out.println(String.format("%.1f", sum));
        }
    }


}
