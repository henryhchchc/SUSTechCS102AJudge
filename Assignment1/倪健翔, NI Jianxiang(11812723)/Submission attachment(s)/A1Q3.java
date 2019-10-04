import java.util.Scanner;
 
 
 
public class A1Q3{

    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        double total =0;
       while (input.hasNext()) {
            Double price=input.nextDouble();
            Double dishes=input.nextDouble();
            int a= (int)  ( dishes*2);
            if (a%2==0) {
            total=total+price*dishes;
           
            }  
             else {
                
                float b= (float) (price / 2 + 1);
                b=Math.round(b*10)/10;
                total=total+b+(dishes-0.5)*price;
              
            }   
           
        }
       input.close();
        System.out.printf("total:"+"%.1f",total);
    }
}