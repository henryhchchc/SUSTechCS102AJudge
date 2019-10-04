import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double price, num, sum = 0;
        while(sc.hasNext()){
            price = sc.nextDouble();
            num = sc.nextDouble();
            String result = String.format("%.1f", price * (int)num);
            sum += Double.valueOf(result);
            if(num - (int)num == 0.5){
                result = String.format("%.1f", price / 2 + 1);
                sum += Double.valueOf(result);
            }
        }
        System.out.printf("%.1f", sum);
    }
}
