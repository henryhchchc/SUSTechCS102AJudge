import java.util.Arrays;
import java.util.Collections;

public class A1Q4 {
    public static void main(String[] args) {
        int j = args.length,i;
        int consumptions = 0;
        for(i = 1;i <= j;i++){
            String consumption = args[i-1];
            int con = Integer.parseInt(consumption);
            consumptions += con;
        }
        int max = 0;
        for(i = 1;i <= j;i++){
            String k = args[i-1];
            int num = Integer.parseInt(k);
            if(num >= max)
                max = num;
        }
        if((consumptions >= 5000 && j >= 10 )|| max >= 8000){
            System.out.print("Diamond");
        }
        else if((consumptions >= 2000 && j >= 5) || max >= 3000){
            System.out.print("Gold");
        }
        else if(consumptions >= 800 && j >= 2 || max >= 1000){
            System.out.print("Silver");
        }
    }
}
