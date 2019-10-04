import java.util.Scanner;

public class A1Q2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a, b, c;
        int i, j, k;
        int m, s;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        i=input.nextInt();
        j=input.nextInt();
        k=input.nextInt();
        m=(i-a)*60+j-b;
        s=m*60+k-c;
        m=s/60;
        s=s%60;
        if (m==0){
         System.out.printf("%ds",s);
        }
        else {
            if (m != 0 && s == 0) {
                System.out.printf("%dm", m);
            } else {
                System.out.printf("%dm%ds", m, s);
            }
        }
    }
}

