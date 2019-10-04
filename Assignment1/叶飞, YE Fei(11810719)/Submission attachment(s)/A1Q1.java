

import java.util.Scanner;
public class A1Q1 {

    public static void main(String[] args) {


        Scanner id = new Scanner(System.in);
        String name;
        name=id.next();
        int num1 = id.nextInt();
        if(num1>= 19000001 && num1<= 19999999) {
            System.out.println(name+",welcome to SUSTECH Hot Pot Restaurant!");}
        else {
            System.out.println(num1);
        }
    }
}
