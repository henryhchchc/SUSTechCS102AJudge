

import java.util.Scanner;

public class A1Q2{
    public static void main(String args[]){Scanner in=new Scanner(System.in);
    int b1=in.nextInt();
    int b2=in.nextInt();
    int b3=in.nextInt();
    System.out.printf(" %dh%dm%ds",b1,b2,b3);
    int a1=in.nextInt();
    int a2=in.nextInt();
    int a3=in.nextInt();
    System.out.printf(" %dh%dm%ds\n",a1,a2,a3);
    int min=(a1-b1)*60+(a2-b2);
    int seconds= 60-b3+a3;
    if(b3>a3){min=min-1;System.out.printf("%dm%ds",min,seconds);}
    else if (b3==a3){seconds=0;System.out.println(min);}
        else if(a1*3600+a2*60+a3==b1*3600+b2*60+b3){System.out.println("0s");}



    }
}