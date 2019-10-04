import java.util.Scanner;

public class A1Q1 {
    public static void main(String[]args){
//        Scanner input=new Scanner(System.in);
//        int number=input.nextInt();
//        char name =input.next().charAt(0);
        String name=args[0];
        int number = Integer.parseInt(args[1]);
        if(number<12000000&&number>=11500000) {
            System.out.println(name+", welcome to SUSTECH Hot Pot Restaurant!");
        }
        else {
            System.out.println(number);
        }
    }
}
