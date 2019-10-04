import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,m,n,l;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        m=input.nextInt();
        n=input.nextInt();
        l=input.nextInt();
        int D1=0,D2;
        if (a>m)System.out.print("Wrong");
        if (a<m-24)
            System.out.print("Wrong");
        if (a<=m)
            D1=(3600*m+60*n+l-3600*a-60*b-c)/60;
            D2=(3600*m+60*n+l-3600*a-60*b-c)-D1*60;
        {if(3600*m+60*n+l-3600*a-60*b-c<0)
            System.out.print("Wrong");
        else if(D1==0&&D2==0)
                System.out.print("0s");
        else if (D1==0&&D2!=0)
            System.out.printf("%ds",D2);
        else if  (D1!=0&&D2==0)
            System.out.printf("%dm",D1);
        else if ( D1!=0&&D2!=0)
            System.out.printf("%sm%ss",D1,D2);
    }}
}
