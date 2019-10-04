import  java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int hour1;  int minute1;  int second1;
        int hour2;  int minute2;  int second2;
        int a;int b;
        hour1=input.nextInt();
        minute1=input.nextInt();
        second1=input.nextInt();
        hour2=input.nextInt();
        minute2=input.nextInt();
        second2=input.nextInt();
        a=(hour2*3600+minute2*60+second2-hour1*3600-minute1*60-second1)/60;
        b=(hour2*3600+minute2*60+second2-hour1*3600-minute1*60-second1)%60;
        if(a==0 & b==0) {
            System.out.println("0s");
        }else if(a==0&b!=0)
            System.out.printf("%ds",b);
        else if(a!=0&b==0)
            System.out.printf("%dm",a);
            else if(a!=0&b!=0)
                System.out.printf("%dm%ds",a,b);

    }
}
