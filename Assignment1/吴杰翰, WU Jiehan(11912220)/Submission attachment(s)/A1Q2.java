import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int s1 = input.nextInt();
        int h2 = input.nextInt();
        int m2 = input.nextInt();
        int s2 = input.nextInt();
        int minus;
        minus=(h2-h1)*3600+(m2-m1)*60+(s2-s1);
        int minute;
        int second;
        minute=minus/60;
        second=minus%60;
            if (minute!=0&&second!=0){
            System.out.printf("%dm%ds",minute,second);
        }else if (minute!=0&&second==0){
                System.out.printf("%dm",minute);
    }else {
                System.out.printf("%ds",second);
            }
    }
}
