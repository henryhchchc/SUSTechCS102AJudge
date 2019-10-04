import java.util.Scanner;
public class q{
    public static void main(String[]args) {
        int a,b,c,d,e,f,g,x,y,t;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        f=input.nextInt();
        g=input.nextInt();
        t=(d-a)*3600+(f-b)*60+g-c;
        x=t/60;
        y=t-60*x;
        if (x!=0&&y!=0)
            System.out.printf("%dm%ds\n",x,y);
        if (x==0&&y!=0)
            System.out.printf("%ds\n",y);
        if (x!=0&&y==0)
            System.out.printf("%dm\n",x);
        if (x==0&&y==0)
            System.out.printf("0s\n");

    }
}