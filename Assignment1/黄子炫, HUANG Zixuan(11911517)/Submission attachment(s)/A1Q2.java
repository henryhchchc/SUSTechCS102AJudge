import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int time1,time2,time3,timea,timeb,timec,a,b;
        time1 = input.nextInt();
        time2 = input.nextInt();
        time3 = input.nextInt();
        timea = input.nextInt();
        timeb = input.nextInt();
        timec = input.nextInt();
        a = time1*3600+time2*60+time3;
        b = timea*3600+timeb*60+timec;
        a = b - a;
        b = a % 60;
        a = a/60;
        if (b == 0 && a != 0){
            System.out.printf("%dm",a);
        }else if (b!=0 && a!=0){
            System.out.printf("%dm%ds",a,b);
        }else if (a==0&&b==0){
            System.out.print("0s");
        }else{
            System.out.printf("%ds",b);
        }
    }
}
