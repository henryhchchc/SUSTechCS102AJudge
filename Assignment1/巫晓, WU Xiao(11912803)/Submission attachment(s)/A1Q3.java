import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double counter = 0;
        while(input.hasNext()){
            double price, number;
            price = input.nextDouble();
            number = input.nextDouble();
            if(number-Math.floor(number) != 0) {
                counter +=price * Math.floor(number);
                String temp_my = String.format("%.1f",price*0.5+1);
                counter += Double.parseDouble(temp_my);
            } else {
                counter =counter + price * number;
            }
        }
        System.out.printf("%.1f\n",counter);
    }
}
