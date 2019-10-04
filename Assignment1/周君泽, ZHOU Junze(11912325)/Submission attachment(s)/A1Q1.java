//import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        String name = input.next();
//        long a = input.nextInt();
        String name = args[0];
        long a = Integer.parseInt(args[1]);
        if (a>=11500000 && a<12000000) {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        }else System.out.printf("%d",a);

    }
}
