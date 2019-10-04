
import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        d = d-a;
        e = e-b;
        f = f-c;
        e = e+d*60;
        if(f<0){
            f=f+60;
            e=e-1;
        }
        if(e!=0&f!=0)
            System.out.printf("%dm %ds",e,f);
        if(e!=0 & f==0)
            System.out.printf("%dm ",e);
        if(e==0&f!=0)
            System.out.printf("%ds",f);
        if(e==0&f==0)
            System.out.println("0s");
        in.close();
    }
}
