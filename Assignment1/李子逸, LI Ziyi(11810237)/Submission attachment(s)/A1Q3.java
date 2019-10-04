import java.util.Scanner;

public class A1Q3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double sum ;
        double total = 0;

        while (input.hasNext()){
            double price = input.nextDouble();
            double a = input.nextDouble();
            double b = Math.round((price*10)/20);

            if(a==(int)a)
                sum = price*a;
            else
                sum = price*(a-0.5)+ b+1;
            total = sum+total;
        }
        System.out.printf("%.1f\n",total);



        }

}
