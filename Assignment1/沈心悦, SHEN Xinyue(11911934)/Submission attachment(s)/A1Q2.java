import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int number1,number2,number3;
        int number4,number5,number6;
        int a,b;

        number1 = input.nextInt();
        number2= input.nextInt();
        number3= input.nextInt();

        number4 = input.nextInt();
        number5 = input.nextInt();
        number6 = input.nextInt();

        a=(number4-number1)*60+(number5-number2);
        b=number6-number3;

        if (b>0)
            System.out.printf("%sm%ss",a,b);
        else if (-b>0) {
        a=a-1;b=b+60;
        System.out.printf("%sm%ss",a,b);}
        else if (b==0&a>0)
            System.out.printf("%sm",a);
        else if (a==0&b==0)
            System.out.printf("%ss",b);
    }
}
