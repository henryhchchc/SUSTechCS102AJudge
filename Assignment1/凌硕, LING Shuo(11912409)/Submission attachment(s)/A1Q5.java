import java.util.Scanner;
public class A1Q5 {
    public static void main(String[] args) {
        double a;
        double b;
        int c;
        double d = 0;
        int length = args.length;
        int i= 0;
        while (i <= length - 1) {
            a = Double.parseDouble(args[i]);
            b=  Math.floor(a);
            c= (int) (b%10);
            if(c==2){
                d=a+4;
                System.out.printf("%.1f ", d);
            }
            else if(c==4){
                d=a+5;
                System.out.printf("%.1f ", d);
                   }
            else{  //2
                       d=a;
                   }//2
            i = i+1;
        } //while
    }
}
