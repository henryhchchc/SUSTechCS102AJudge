import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double sum = 0;
        while (in.hasNext()) {
            double price = in.nextDouble();
            double piece = in.nextDouble();
            if (piece%1==0)
            {
                sum = sum + price * piece;
            }
            else
                {
                sum = sum + price/2+1+price*Math.floor(piece);
            }
        }
        if(sum%0.1>=0.05){
            sum=sum+0.1;
        }


            System.out.printf("%.1f", sum);


    }
}
