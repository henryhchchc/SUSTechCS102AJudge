import java.awt.*;
//import java.util.Scanner;
public class A1Q4 {
    public static void main(String[] args){
        int n = 0;
        int t = 0;
        float con = 0,sum = 0,temp = 0;
        while(t<args.length) {
             t = t+1;
             con = Float.parseFloat(args[t-1]);
             if (temp<=con)
                 temp = con;
             sum = sum + con;
         }
        if (temp>=8000)
            System.out.println("Diamond");
        else
            if (temp>=3000)
            {
                if (t>=10){
                    if (sum>=5000)
                        System.out.println("Diamond");
                    else System.out.println("Gold");
                }
                else System.out.println("Gold");
            }
            else if (temp>=1000)
            {
                if (t>=5)
                {
                    if (sum>=2000)
                        System.out.println("Gold");
                    else System.out.println("Silver");
                }
                else System.out.println("Silver");
            }
            else if (t>=2){
                if (sum>=800)
                    System.out.println("Silver");}





        }
    }

