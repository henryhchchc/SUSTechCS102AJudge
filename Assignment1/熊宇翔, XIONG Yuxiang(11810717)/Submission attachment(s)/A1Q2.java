import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hh1=in.nextInt();
        int mm1=in.nextInt();
        int ss1=in.nextInt();
        int hh2=in.nextInt();
        int mm2=in.nextInt();
        int ss2=in.nextInt();
        int a=hh2-hh1;
        int b=mm2-mm1;
        int c=ss2-ss1;
        int d=60*a+b;
        if(b>0){
            if(c<0){
                System.out.println((d-1)+"m"+(c+60)+"s");
            }
            else{if(c==0) {
                System.out.println(d + "m" );
                }
                else{
                System.out.println(d + "m" + c + "s");
            }
            }
            }
        else{
        System.out.println(c+"s");
        }
    }
}
