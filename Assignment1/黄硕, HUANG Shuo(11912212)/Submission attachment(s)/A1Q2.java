import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,d,e,f,g,h,i;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        f=input.nextInt();
        if (f>=c){
            i=f-c;
            g=d-a;
            h=60*g+e-b;
        }
        else {
            i=f-c+60;
            g=d-a;
            h=60*g+e-b-1;
        }
            if (h == 0){
                System.out.printf("%ds", i);}
            else {
                if (i != 0){
                    System.out.printf("%dm%ds", h, i);}
                else{
                    System.out.printf("%dm", h);}
        }
    }
}
