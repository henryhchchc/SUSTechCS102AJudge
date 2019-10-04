import java.util.Scanner;

public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        int a = 0;

        while(a<length){
            float price = Float.parseFloat(args[a]);
            if (0<=(price%10-2)&&(price%10-2)<1) {
                price += 4;
                System.out.printf("%.1f ", price);
                a++;
            }
            else if(0<=(price%10-4)&&(price%10-4)<1){
                price += 5;
                System.out.printf("%.1f ", price);
                a++;
            }
            else {
                a++;
            }
        }

    }
}
