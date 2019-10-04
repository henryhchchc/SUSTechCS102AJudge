import java.util.Scanner;

public class A1Q4 {
    public static void main (String[]args){
        double sum=0;
        int times=args.length;
        double max=Double.valueOf(args[0]);
        for (int i=0;i<args.length;i++){
            sum+= Double.valueOf(args[i]);

        }

        for(int i=1;i<times;i++){

            if (max<Double.valueOf(args[i]))
                max=Double.valueOf(args[i]);
        }
        if((sum>=5000&& times>=10)||max>=8000)
        {System.out.print("Diamond");}
        else if ((sum>=2000&&times>=5)||max>=3000)
            System.out.print("Gold");
        else if ((sum>=800&&times>=2)||max>=1000)
            System.out.print("Silver");
}
}