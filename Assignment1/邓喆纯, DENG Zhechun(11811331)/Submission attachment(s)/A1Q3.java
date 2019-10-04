import java.util.Scanner;
public class A1Q3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double total=0;
        while(in.hasNext()) {
            double price = in.nextDouble();
            double piece = in.nextDouble();
            if ( Math.round(piece) - piece != 0) {
                double d1= (piece-0.5)*price + (price/2)+1;
                String str_d1=String.format("%.1f",d1);
                double d2=Double.parseDouble(str_d1);
                total = total + d2;
            }
            else {
                double d3=price*piece;
                String str_d3=String.format("%.1f",d3);
                double d4=Double.parseDouble(str_d3);
                total = total + d4;
            }
        }

        System.out.printf("%.1f",total);
    }

}

