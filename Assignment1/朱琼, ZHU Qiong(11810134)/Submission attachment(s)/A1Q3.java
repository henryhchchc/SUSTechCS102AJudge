import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        double money = 0;
        while(in.hasNext()){
            double price = in.nextDouble();
            double num = in.nextDouble();
            if((int)num == num){
                money =money+price*num;}
            else{
                number= new Double(num).intValue();
            money = money + (number * price) + Math.round((price / 2) + 1);}
        }
        System.out.printf("%.1f",money);
    }
}
