import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double price = 0;
        double number = 0;
        while(in.hasNext()){
            price = in.nextDouble();
            number = in.nextDouble();
            if(number % 1 != 0){
                sum += price*(int)number +Math.round(price*0.5)+1;
            }
            if(number % 1==0){
                sum += price*number;
            }
        }
        System.out.printf("%.1f",sum);
    }
}
