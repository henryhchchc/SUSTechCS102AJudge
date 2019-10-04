import java. util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        int a,b,c,d,e,f,g,h;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        f=input.nextInt();
        int time1 = a*3600 + b*60 + c;
        int time2 = d*3600 + e*60 + f;
        int  cha = time2  -  time1;
         g=cha/60;   h=cha%60;
        if(g!=0&h!=0)
            System.out.printf("%dm%ds",g,h);
        else if(g!=0&h==0)
            System.out.printf("%dm",g);
        else if(g==0&h!=0)
            System.out.printf("%ds",h);
        else if(g==0&h==0)
            System.out.print("0s");

    }
}
