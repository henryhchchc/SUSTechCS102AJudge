import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour1,minute1,second1,hour2,minute2,second2;
        hour1 = input.nextInt();
        minute1 = input.nextInt();
        second1 = input.nextInt();
        hour2 = input.nextInt();
        minute2 = input.nextInt();
        second2 = input.nextInt();
        int time1,time2,a,b,c;
        time1 = hour1*3600 + minute1*60 + second1;
        time2 = hour2*3600 + minute2*60 + second2;
        a =time2 - time1;
        b = a/60;
        c = a%60;
        if (c!=0&&b !=0) {
            System.out.printf(b + "m" + c + "s");
        }else if (b ==0&&c ==0){
            System.out.printf("%ds",c);}
        else{
            System.out.printf("%dm",b);
        }

    }
}