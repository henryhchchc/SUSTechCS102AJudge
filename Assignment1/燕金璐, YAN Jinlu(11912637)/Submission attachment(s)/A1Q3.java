import java.util.Scanner;
public class A1Q3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float price,number,sum=0;               //N:需要先给sum赋值，否则在if循环中的sum会报错
        while(input.hasNext()){
            price=input.nextFloat();
            number=input.nextFloat();
            if (number % 1 == 0){
                sum+= price*number;
            }else{
                float number1=number-number % 1;     //取整
                float number2=number % 1;            //取余
                float price1=price * number2;

                if (price1 % 1 >= 0.5){
                    sum += price * number1 +(price1 - price1 % 1) + 2;
                }else if (price % 1 < 0.5){
                    sum += price * number1 +(price1 - price1 % 1) + 1;
                }

            }
        }
        System.out.printf("%f",sum);
    }
}