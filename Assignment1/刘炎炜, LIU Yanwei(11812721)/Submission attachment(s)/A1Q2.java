
import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 6;
        int b = 0;
        double e;
        while(n-->0){
         int a = input.nextInt();
          if (n<3){
              e = Math.pow(60,n%3);
              b += a * e;
          }else {
              e = Math.pow(60,n%3);
              b -= a * e;
          }
        }
        int c = b%60;
        int d = b/60;
        if (c==0 && b==0){
            System.out.printf("%ds", c);
        }else if (b==0){
            System.out.printf("%ds", c);
        }else if (c==0){
            System.out.printf("%dm", d);
        }else {
            System.out.printf("%dm%ds", d,c);
        }

    }
}
