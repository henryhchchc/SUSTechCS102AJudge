import java.util.Arrays;
import java.util.Scanner;

public class A1Q4 {
    public static void main(String[] args){
        int n = args.length;
        int[] cost = new int[n];
        for(int i = 0; i < n; i++){
            cost[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(cost);
        int total = 0;
        for(int i = 0; i < n; i++)
            total = total + cost[i];
        if(n > 9 && total > 4999 || cost[n-1] > 7999){
            System.out.print(" Diamond");
        }
        else if(n > 4 && total >1999 || cost[ n - 1 ] >2999){
            System.out.print(" Gold");
        }
        else if( n > 1 && total > 799 || cost[n-1] >999){
            System.out.print(" Silver");
        }
    }
}
