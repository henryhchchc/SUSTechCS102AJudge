import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        int h1;int m1;int s1;
        int s2;int m2;int h2;
        int a;int b;int c;
        Scanner input=new Scanner(System.in);
        h1=input.nextInt();m1=input.nextInt();s1=input.nextInt();
        h2=input.nextInt();m2=input.nextInt();s2=input.nextInt();
        c=(h2*3600+m2*60+s2)-(h1*3600+m1*60+s1);
        a=c/60;b=c%60;
        if (c<0)
            System.out.printf("wrong time");
        else if (c == 0)
            System.out.printf("0s");
        else if (c<60)
            System.out.printf("%ds",b);
        else{if (b==0)
            System.out.printf("%dm",a);
        else System.out.printf("%dm%ds",a,b);
        }
    }
}
