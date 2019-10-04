import java.util.Scanner;

public class A1Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i=0;
        float x=0;
        while(i<args.length){
            x= Float.parseFloat(args[i]);
            if ((int)x%10==2)
                System.out.printf("%.1f ",x+4);
            if ((int)x%10==4)
                System.out.printf("%.1f ",x+5);
            i++;
        }
    }
    }
