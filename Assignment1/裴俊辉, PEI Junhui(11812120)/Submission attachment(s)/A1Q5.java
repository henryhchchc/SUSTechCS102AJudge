import java.util.Scanner;

public class A1Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price;
        double a;
        double b;
        double c;
        while(input.hasNext()){
            price = input.nextFloat();
            a = price;
            b = (int)a/10;
            c =(int)a-10*(int)b;
            if(c==2){
                price=price+4;
            }
            else if (c==4){
                price=price+5;
            }
            System.out.printf("%.1f ",price);
        }
    }
}