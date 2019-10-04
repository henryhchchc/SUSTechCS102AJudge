import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=input.nextInt();
        int f=input.nextInt();
        int x,z,g,h;
        x=3600*a+60*b+c;
        z=3600*d+60*e+f;
        g=(z-x)/60;
        h=(z-x)%60;
        if (z==x)
            System.out.printf("%ds",h);
        if (h==0)
            System.out.printf("%dm",g);
        else
        System.out.printf("%dm%ds",g,h);




    }
}
