import java.util.Scanner;

public class A1Q4 {
    public static void main(String[] args){
        int i = 0;
        int counter = args.length;
        int total = 0;
        int s;
        for(s = 1;s<=counter;++s ){
            i = Integer.parseInt(args[s-1]);
            total += i;
        }
        if((counter>=10 && total>=5000) || i>=8000){
            System.out.println("Diamond");
        }else
            if ((counter>=5 && total>=2000) || i>=3000){
                System.out.println("Gold");
            }else
                if((counter>=2 && total>=800) || i>=1000){
                    System.out.println("Silver");
                }


    }
}
