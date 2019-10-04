import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float sum = 0;

        while(input.hasNext()){

            double value = input.nextDouble();
            double num1 = input.nextDouble();
            double num = num1;

            do{
                num -= 1;
            }while(num>0);

            if(num==0){
sum += value*num1;
            }else{ sum += value*(num1-0.5) + (Math.round(value)/2 + 1);
        }
        }System.out.printf("%.1f",sum);
    }
}
