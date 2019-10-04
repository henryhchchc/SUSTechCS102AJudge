import java.util.Scanner;
public class A1Q3 {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        float total=0;




        while(in.hasNext()){
           float price=in.nextFloat();
            float pieces=in.nextFloat();
            if(pieces*2%2==0)
                total+=price*pieces;
            else{
        total+= (float) (Math.round(price/2)+ 1 + price*(pieces-0.5));}


        }

              System.out.printf("%.1f", total);


        }
    }

