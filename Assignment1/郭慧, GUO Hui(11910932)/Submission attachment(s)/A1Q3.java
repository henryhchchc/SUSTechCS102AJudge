import java.util.Scanner;
//import Scanner
public class A1Q3 {

    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        double total=0;

        while(input.hasNext()){
            double price=input.nextDouble();
            double amount=input.nextDouble();
            //input price and amount
            total +=Float.parseFloat(String.format("%.1f",price*amount));
            //round the price of every dish
            if(amount%1!=0) {
                total++;
                //add a dollar to the price  of half piece of dish
            }
        }
        System.out.printf("%.1f",total);
        //print the final price
    }
}
