import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,n1;
        String name;
        name=args[0];
        number=Integer.parseInt(args[1]);
        n1=number-(number%100000);
        if (10000000<=number&&number<=99999999){
            if(n1>=11500000&&n1<=11900000){
                System.out.printf("%s,welcome to SUSTECH Hot Pot Restaurant!",name);
                return;
                // write your code here
            }}
        System.out.printf("%d",number);
    }
}
