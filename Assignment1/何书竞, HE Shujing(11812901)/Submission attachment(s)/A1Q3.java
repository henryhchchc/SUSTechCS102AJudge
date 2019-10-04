
import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum=  0;

        while(in.hasNext()){
            double price = in.nextDouble();
            double piece = in.nextDouble();
            int i = (int)piece;
            if(piece-i>0)
                sum = sum + price * i + Math.round(price) * (piece - i) + 1;
            else
                sum = sum + price * piece;

        }
        System.out.printf(sum+"");
    }


}
