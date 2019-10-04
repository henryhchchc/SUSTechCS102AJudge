import  java.util.Scanner;
public class A1Q3 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double money=0;
        while (input.hasNext()){
            double price = input.nextDouble();
            double fen = input.nextDouble();
            double a = fen/0.5;
            if(a%2==0){
                money+=fen*price;
            }
            if(a%2!=0){
                double money1;
                double money2;
                money1=(fen-0.5)*price;
                money2=price/2+1;
                double z=money1+money2;
                double q =(int)(10*z+0.5);
                double o=q/10;
                money+=o;
            }
        }
        System.out.printf("%.1f",money);

    }
}
