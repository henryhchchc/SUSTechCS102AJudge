import java.util.Scanner;
public class A1Q5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length =args.length;
        int i=0;
        while(i<length){
            double d=Double.parseDouble(args[i]);
            int a=(int) Math.floor(d);
            double m=a%10;
            if(m==2){double b=d+4;
                System.out.printf(" %.1f",b);}
            else if(m==4){double c=d+5;
                System.out.printf(" %.1f",c);};
            i++;}
    }
}

