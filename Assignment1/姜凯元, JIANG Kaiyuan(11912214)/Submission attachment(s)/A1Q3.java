import java.util.Scanner;

public class A1Q3 {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        double price, total=0;

        while(input.hasNext()) {
            double single=input.nextFloat();
            double number=input.nextFloat();
            int a = (int) number;
            double sin=Math.ceil(single);

            if(number%1==0){
                price=single*number;}
            else{
                price=single*a+sin*(number%1)+1;}
                total = total + price;
        }
        System.out.printf("%.1f",total);
    }
}
