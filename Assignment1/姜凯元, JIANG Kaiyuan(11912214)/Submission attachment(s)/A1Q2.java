import java.util.Scanner;

public class A1Q2 {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=input.nextInt();
        int f=input.nextInt();

        int h=(d*3600+e*60+f-a*3600-b*60-c)/60;
        int i=(d*3600+e*60+f-a*3600-b*60-c)%60;

        if(h==0&&i==0)
            System.out.printf("0s");
        else if(h==0&&i!=0)
            System.out.printf("%ss",i);
        else if(h!=0&&i==0)
            System.out.printf("%sm",h);
        else
            System.out.printf("%sm%ss",h,i);
    }
}
