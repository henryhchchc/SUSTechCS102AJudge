import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        double price,num,total,a;
        total = 0;
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            price = input.nextDouble();
            num = input.nextDouble();
            if (num%1 == 0.5){
                total = total + Math.round(price*num*10)*1.0/10 + 1;
            }else{
                total = total + price*num;
            }
        }
        System.out.printf("%.1f",total);
    }
}
