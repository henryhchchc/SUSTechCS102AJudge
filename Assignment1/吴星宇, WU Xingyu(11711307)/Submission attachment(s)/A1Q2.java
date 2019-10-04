//package A1;
import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        int sum1 = a*3600 + b*60 + c;
        int sum2 = d*3600 + e*60 + f;
        int difference = sum2 - sum1;
        int remainder = difference % 60;
        int quotient = (difference - remainder) / 60;
        if(quotient == 0 && remainder == 0){
            System.out.println( 0+"s" );
        }
        else if(quotient == 0 && remainder != 0){
            System.out.println( remainder + "s" );
        }
        else if(quotient !=0 && remainder == 0){
            System.out.println( quotient+"m" );
        }
        else{
            System.out.println( quotient+"m"+remainder+"s" );
        }



    }
}
