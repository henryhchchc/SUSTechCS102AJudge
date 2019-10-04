import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double output = 0;
        while (in.hasNext()) {
            double sum;
            double price = in.nextDouble();
            double amount = in.nextDouble();
            if (amount%1!=0){
               sum = 0.5*price+1+(amount-0.5)*price;
                output+=sum;
            }else {
                sum = amount*price;
                output+=sum;
            }
        }
        System.out.printf("%.1f",output);
    }
}
