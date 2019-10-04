import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price=0.0,num=0.0,sum=0.0,total=0.0;
        while (input.hasNext()) {
            price=input.nextDouble();
            num=input.nextDouble();
            if((num*2)%2==0){
                sum=price*num;
            }
            else if((num*2)%2==1){
                sum = price * (int)num +Math.round(price*0.5+1);
            }
            total=total+sum;
        }
        System.out.printf("%.1f",total);

    }
}
