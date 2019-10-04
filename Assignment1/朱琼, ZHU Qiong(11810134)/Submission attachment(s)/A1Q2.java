import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 ,b1,c1,a2,b2,c2,a3,b3,c3;
        a1=in.nextInt();
        b1=in.nextInt();
        c1=in.nextInt();
        a2=in.nextInt();
        b2=in.nextInt();
        c2=in.nextInt();
        a3=a2-a1;
        b3=b2-b1;
        c3=c2-c1;
        if (a2>a1){
            a3=a2-a1;
            b3=b2-b1+a3*60;}
        if(c2<c1){
            c3=c2-c1+60;
            b3--;}
        if(b3==0)
            System.out.print(c3+"s");
         else if(c3==0)
             System.out.print(b3+"m");
         else
             System.out.print(b3+"m"+c3+"s");
    }
}