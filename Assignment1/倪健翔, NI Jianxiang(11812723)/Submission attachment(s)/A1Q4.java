import java.util.Scanner;

public class A1Q4{
    public static void main(String[] args){
       
        int length =args.length;
        int counter=0;
        int total =0;
        int greatest=0;
        
        int total2 = total;
        for(int i=0;i<length;i++){
            counter++;
           
         int[] cost=new int[length];
         cost[i]=Integer.parseInt(args[i]) ;
         if(greatest<cost[i]){
             greatest=cost[i];
         } 
            total = total2 + cost[i];
        }
        if((counter>=10&&total2>=5000)||greatest>=8000){
            System.out.print("Diamond");
        }
        else if ((counter >= 5&& total2 >= 2000) || greatest >= 3000) {
            System.out.print("Gold");
        }
        else if ((counter >= 2 && total2 >= 800) || greatest >= 1000) {
            System.out.print("Silver");
        }
       
    }
}