import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum=0.0;
        while (scanner.hasNext()) {
            double price = scanner.nextDouble();
            double amount = scanner.nextDouble();
            double rest = amount - Math.floor(amount);
            if(rest!=0)
                sum+=price*((int)amount)+(Math.round(price*0.5*10))/10+1;
            else
                sum += (price * amount);
        }
        System.out.printf("%.1f",sum);
        }
        }