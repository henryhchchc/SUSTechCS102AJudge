import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){

        double price,copies;
        double money = 0;
        int copy,t;

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            price = in.nextDouble();
            copies = in.nextDouble();
            if((copies%1) == 0) {
                money += price * copies;
            }
            else{
                copy = (int) copies;
                t = Math.round((float) (price * 1.0 / 2)*10);
                money += price * copy + t / 10 + 1;
            }
        }
        System.out.printf("%.1f",money);

        }
    }