import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sum = 0;
        while(input.hasNext()){
            double price = input.nextDouble();
            double piece = input.nextDouble();
            double tmp = 0;
            tmp = price*piece;
            if(3*(int)piece != 3*piece){
                tmp += 1;
            }
            String transfer = String.format("%.1f",tmp);
            double tmp2 = Double.parseDouble(transfer);
            sum += tmp2;
        }
        System.out.printf("%.1f",sum);
    }
}