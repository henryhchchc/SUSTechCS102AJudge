import java.util.Scanner;
public class A1Q3{

public static void  main (String[] args) {
        Scanner input = new Scanner(System.in);
        double money=0,sum=0;
        while(input.hasNext()){
        double price = input.nextDouble();
        double many = input.nextDouble();
        money=many*price+(many-Math.floor(many))*2;
        sum+=money;
        }
        System.out.println("End");
        System.out.println(sum);
        }


        }