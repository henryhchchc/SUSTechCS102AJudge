import javax.swing.*;

public class A1Q5 {

    public static void main(String[] args){

        int length = args.length;
        int i = 0;
        int a;
        while (i < length){
            double price = Double.parseDouble(args[i]);
            double P1 = 0;
            a = (int)Math.floor(price) % 10;

            if (a == 2){
            P1 = price + 4;
            System.out.printf("%.1f"+" ",P1);
            }
            if (a == 4) {
                P1 = price + 5;
                System.out.printf("%.1f" + " ", P1);
            }
            ++i;

            }
        }



    }
