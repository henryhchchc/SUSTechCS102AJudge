import java.util.Scanner;
public class A1Q1 {

    public static void main(String[] args) {
        // write your code here
        String name;
        int number;
        Scanner in = new Scanner(System.in);
        name = in.next();
        number = in.nextInt();
        if (number/10000000<1 || number/10000000>10 )
            System.out.println(number);
        else if (number/11500000==1 || number/11600000==1|| number/11700000==1 || number/11800000==1 || number/11900000==1 )
            System.out.println(name+",welcome to SUSTECH HotPot Restaurant!");
        else
            System.out.println(number);

    }
}
