import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int SID = Integer.parseInt(args[1]);
        if (SID>11500000 && SID<12000000){
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);

        }else System.out.println(SID);

    }
}
