import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner Homework = new Scanner(System.in);
        double sum = 0;
        while(Homework.hasNext()){
            double price = Homework.nextDouble();
            double a     = Homework.nextDouble();
            double b     = Math.floor(a);
            if(a!=b){
                sum = sum+(a-b)*price+1+b*price;
                String c = String.format("%.1f",sum);
                sum = Double.parseDouble(c);
            }
            else {
                sum = sum + b*price;
                String c = String.format("%.1f",sum);
                sum = Double.parseDouble(c);
            }

        }
        System.out.printf("%.1f",sum);
    }
}
