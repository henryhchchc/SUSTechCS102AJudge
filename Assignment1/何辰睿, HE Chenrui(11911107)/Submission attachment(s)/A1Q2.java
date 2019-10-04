import  java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1,n2,n3,n4,n5,n6,t1,t2,T,m,s;
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();
        n6 = input.nextInt();
        t1 = n1 * 3600 + n2 * 60 + n3;
        t2 = n4 * 3600 + n5 * 60 + n6;
        T = t2 - t1;
        s = T % 60;
        m = (T - s) / 60 ;

        if (m != 0 && s != 0)
            System.out.printf("%dm%ds",m,s);
        if (m != 0 && s == 0)
            System.out.printf("%dm",m);
        if (m == 0)
            System.out.printf("%ds",s);


    }
}
