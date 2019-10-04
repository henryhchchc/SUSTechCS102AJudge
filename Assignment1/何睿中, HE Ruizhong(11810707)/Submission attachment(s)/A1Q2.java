import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int h1=in.nextInt();
        int m1=in.nextInt();
        int s1=in.nextInt();
        int h2=in.nextInt();
        int m2=in.nextInt();
        int s2=in.nextInt();
        int T1=h1*3600+m1*60+s1;
        int T2=h2*3600+m2*60+s2;
        int T=T2-T1;
        if(T==0){
            System.out.print(T+"s");
        } else if(T>0&T<60){
            System.out.println(T+"s");
        } else if(T>=60&&T%60==0){
            System.out.printf("%dm",T/60);
        } else {
            System.out.println(T/60+"m"+T%60+"s");
        }
        }
    }


