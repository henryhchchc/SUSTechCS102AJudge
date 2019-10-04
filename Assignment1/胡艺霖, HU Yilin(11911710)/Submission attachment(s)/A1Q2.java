import java.util.Scanner;
public class A1Q2 {
    public static void main (String[]args){
        Scanner love = new Scanner(System.in);
int a, b, c,d,e,m,n,f;
        m=love.nextInt();
        n=love.nextInt();
        f=love.nextInt();
        a=love.nextInt();
        b=love.nextInt();
        c=love.nextInt();
        a=a-m;
        d=b-n;
        e=c-f;
        if(d>=0)
            d=d+a*60;
        else d=d+60+(a-1)*60;
        if (e>=0)
            e=e;
        else{ e=e+60 ;d=d-1;}
        if (d==0)
            System.out.printf("%ds",e);
        else if(e==0)
        System.out.printf("%dm",d);
        else
        System.out.printf("%dm%ds",d,e);
    }
}
