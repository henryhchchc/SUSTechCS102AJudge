import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        int start = 3600*a+60*b+c;
        int end = 3600*d+60*e+f;
        int min = (end-start)/60;
        int sec = (end-start)%60;

        if(min ==0){
            System.out.printf("%ds",sec);}
        else
        if(sec == 0){
            System.out.printf("%dm",min);}
        else
            System.out.printf("%dm%ds",min,sec);
    }
}