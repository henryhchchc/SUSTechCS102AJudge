
import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args){
        String name;
        int id;

        name = args[0];

        id = Integer.parseInt(args[1]);
        if (id>=11500000 && id<=12000000) {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant\n", name);
        }else{
            System.out.printf("%d",id);
        }

        }




}
