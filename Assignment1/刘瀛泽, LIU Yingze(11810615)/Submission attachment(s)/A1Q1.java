import java.util.Scanner;
public class A1Q1{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in) ;
       String name = scan.next();
       int ID = scan.nextInt();
        if((ID<12000000)&&(ID>11500000)){
            System.out.println(name+",welcome to SUSTECH Hot Pot Restaurant!");
        }else{
            System.out.println(ID);
        }

        scan.close();
    }
}