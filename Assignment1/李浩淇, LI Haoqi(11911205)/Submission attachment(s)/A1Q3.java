import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double money = 0;
        double i;
        while(in.hasNext()){
            double price = in.nextDouble();
            double number = in.nextDouble();
            if (number%1 == 0){
                money = money + price * number;}
            else{
                i = 10*(price*number + 1);
                i = Math.round(i);
                money = money + i/10;
            }
        }
        System.out.printf("%s",money);
    }
}
