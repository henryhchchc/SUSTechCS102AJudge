

import java.util.Scanner;

public class A1Q4 {
    public static void main(String[] args) {
        int times =args.length, max = 0, sum = 0;
        int i=0;
        while (true) {
            int money = Integer.parseInt(args[i]);
            sum += money;
            if (max <= money)
                max = money;
            if(i==times-1){
                break;}
            else
                i+=1;

    }
        if (((times >= 10) && (sum >= 5000)) || (max >= 8000)) {
            System.out.println("Diamond");
        }
        else if (((times >= 5) && (sum >= 2000)) || (max >= 3000)){
            System.out.println("Gold");
        }
        else if (((times >= 2) && (sum >= 800)) || (max >= 1000)){
            System.out.println("Silver");
        }
    }
    }
