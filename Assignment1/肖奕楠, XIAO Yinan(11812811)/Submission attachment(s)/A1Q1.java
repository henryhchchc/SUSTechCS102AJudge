import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args) {
        String name = args[0];
        int id = Integer.parseInt(args[1]);
        int prefix = id / 100000;
        int k = id / 10000000;
        if(prefix==115||prefix==116||prefix==117||prefix==118||prefix==119){
            if(k == 1)
                System.out.printf("%s, welecome to SUSTECH Hot Pot Restaurant!",name);
        }
        else
            System.out.print(id);

    }
}
