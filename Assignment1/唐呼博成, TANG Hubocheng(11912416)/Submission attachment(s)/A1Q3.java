import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double t;
        t=0.0;
        while(in.hasNext()){
            double f = in.nextDouble();
            double b = in.nextDouble();
            double m=f*0.5+1;
            double w=Math.round(m*10)*0.1;
            int a=(int) Math.floor(b);
            if (b- a==0.5 ) {
                t += ((a*f)+w);
                }
            else {
                t +=(f*b) ;
                }

        }



        System.out.printf("%.1f",t);



        }

    }

