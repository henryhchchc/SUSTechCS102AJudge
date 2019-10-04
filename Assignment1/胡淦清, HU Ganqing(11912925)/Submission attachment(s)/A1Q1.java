import java.util.Scanner;

public class A1Q1 {

    public static void main(String[] args) {
        String name=args[0];
        int ID=Integer.parseInt(args[1]);
        if(ID>11999999)
            System.out.println("This is a wrong ID");
         if(ID<11599999)
             System.out.println("This is a wrong ID");
            if (ID>11500000)
             System.out.println(name+", welcome to SUSTECH Hot Pot Restaurant! ");


    }
}
