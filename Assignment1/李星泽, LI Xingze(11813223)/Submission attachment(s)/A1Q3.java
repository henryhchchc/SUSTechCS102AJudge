import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double price;
        double number;
        double sum = 0 ;
        double result;
        while(input.hasNext()){
            price = input.nextDouble();
            number =input.nextDouble();
            result = price * (int)number;
            sum += result;
            if(number - (int)number == 0.5){
                result = price / 2 + 1;
                sum += result;
            }
        };
        System.out.printf("%.1f",sum);
        //a = 49.9 * 1;
        //b = 9.9 * 2;
        //c = 29.9 / 2 + 1;
        //d = 59.9 + 59.9 / 2 + 1;
        //Total = a + b + c + d;
    }
}
