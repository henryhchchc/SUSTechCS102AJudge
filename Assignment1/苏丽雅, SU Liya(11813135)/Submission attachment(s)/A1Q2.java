import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours1, hours2, minute1, minute2, seconds1, seconds2;
        int time1, time2, time3;
        int m, s;
        hours1 = input.nextInt();
        minute1 = input.nextInt();
        seconds1 = input.nextInt();
        hours2 = input.nextInt();
        minute2 = input.nextInt();
        seconds2 = input.nextInt();
        time1 = hours1 * 3600 + minute1 * 60 + seconds1;
        time2 = hours2 * 3600 + minute2 * 60 + seconds2;
        time3 = time2 - time1;
        m = (time3 / 60) ;
        s = time3 - (60 * m);
        if ( m!=0 && s!=0){
            System.out.printf("%dm%ds",m,s);}
        if(m==0 && s!=0){
            System.out.printf("%ds",s);}
        if(m!=0 && s==0){
            System.out.printf("%dm",m);}
        if(m==0 && s==0){
            System.out.print("0s");}
        }
    }
