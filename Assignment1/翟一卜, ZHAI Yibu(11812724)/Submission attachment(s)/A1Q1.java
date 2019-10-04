import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        long studentid = Integer.parseInt(args[1]);


        if( studentid >= 12000000)
            System.out.printf("%d", studentid);
        else if ( studentid >= 11500000)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", name);
        else
            System.out.printf("%d", studentid);







    }
}
