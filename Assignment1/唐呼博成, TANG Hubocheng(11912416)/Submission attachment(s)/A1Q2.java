import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        f = input.nextInt();
        int n = a * 3600 + b * 60 + c;
        int m = d * 3600 + e * 60 + f;
        int p = m - n;
        int y = p % 60;
        if (p < 60) {
            System.out.printf("%ds", p);
        } else if(y!=0){
            int w = (p - y)/60;
            System.out.printf("%dm%ds", w, y);
        }else if(y==0){int w = (p - y)/60;
            System.out.printf("%dm", w);
    }
}}