import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        float sumnet=0;
        while (in.hasNext()) {
            double price = in.nextDouble();
            double portion = in.nextDouble();
            sum = price * Math.floor(portion) + price * (portion - Math.floor(portion)) + 1 * Math.ceil(portion - Math.floor(portion));
            sum=sum*10;
            sum=Math.round(sum);
            sum=sum/10;
            sumnet+=sum;

        }
        System.out.printf(sumnet+"\n");
        }
    }



