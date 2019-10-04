import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;

        while(input.hasNext()){
            double price = input.nextDouble();
            double quantity = input.nextDouble();
            double dishprice = price*(int)quantity + (float)Math.round((quantity + 1)%1*price*10)/10 + quantity%1*2 ;
            sum += dishprice;
        }
        System.out.printf("%.1f", sum);
    }

}
