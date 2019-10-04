import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        double c =0;
        while(in.hasNext()){
            double a;
            double b;
            double d;
            a= in.nextDouble();
            b= in.nextDouble();
            if (b==Math.floor(b)){
                c+=a*b;

            }
else
    d=Math.rint(10*Math.floor(b)*a+a/2+1);
    c+=d/10;
        }

    }
}
