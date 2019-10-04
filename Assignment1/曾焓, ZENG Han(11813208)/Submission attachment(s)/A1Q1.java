import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int Id =Integer.parseInt(args[1]);
        int a = Id/10000000;
        int b = Id/100000;
        if(a == 0 || a > 1 || b < 115 || b > 119){
            System.out.println(Id);
        }
        else{
            System.out.print(name + " , welcome to SUSTECH Hot Pot Restaurant!");
        }
    }
}
