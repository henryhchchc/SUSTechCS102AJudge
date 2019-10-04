
import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =input.nextInt();
        int b =input.nextInt();
        int c =input.nextInt();
        int d =input.nextInt();
        int e =input.nextInt();
        int f =input.nextInt();
        int m,n;
        if(f>=c){
            m=f-c;
           n=60*(d-a)+e-b;
            System.out.printf("%dm%ds",n,m);
        }
        else{
            m=f+60-c;
            n=60*(d-a)+e-b-1;
            System.out.printf("%dm%ds",n,m);
        }

    }

}
