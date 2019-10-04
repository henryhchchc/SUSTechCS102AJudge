import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        double piece;
        double price;
        double a;
        double sum=0;
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            price= input.nextDouble();
            piece= input.nextDouble();

            if(piece%1!=0){
                a=Math.round(price);
                sum=sum+(a/2)+1+price*(piece-0.5);
            }
            else
                sum=sum+price*piece;
        }
        System.out.printf("%.1f",sum);
    }
}
