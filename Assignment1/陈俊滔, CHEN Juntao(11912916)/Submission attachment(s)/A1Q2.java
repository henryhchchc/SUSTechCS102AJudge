import java.util.Scanner;


public class A1Q2 {
    public static void main(String[] args){
        int h1,m1,s1,h2,m2,s2,t1,t2,t,a,b;
        Scanner input = new Scanner(System.in);
        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();
        t1 = h1 * 3600 + m1 * 60 + s1;
        t2 = h2 * 3600 + m2 * 60 + s2;
        t = t2 - t1;
        a = t / 60;
        b = t % 60;
        if( a > 0 && b > 0 ){
            System.out.printf("%dm%ds",a ,b);
        }else if( b == 0 ){
            if( a > 0) {
                System.out.printf("%dm", a);
            }else if( a == 0 ){
                System.out.printf("%ds",b);
            }
        }else if(a == 0){
            System.out.printf("%ds",b);
        }
    }
}
