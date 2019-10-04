import java.util.Scanner;
public class A1Q2 {
    public static void main (String []args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=input.nextInt();
        int f=input.nextInt();
        int g=(d-a)*3600+(e-b)*60+f-c;
        int m=g/60;
        int s=g%60;
        if (m>0&s>0){
        System.out.printf("%dm%ds",m,s);
        }
        else if (m==0){
        System.out.printf("%ds",s);
        }
        else if (s==0){
        System.out.printf("%dm",m);
        }
    }
}
