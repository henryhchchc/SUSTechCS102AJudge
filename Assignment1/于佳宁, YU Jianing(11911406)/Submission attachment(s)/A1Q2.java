import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        int h1,m1,s1,h2,m2,s2,a,b,c,d;
        Scanner scan=new Scanner(System.in);
        h1=scan.nextInt();
        m1=scan.nextInt();
        s1=scan.nextInt();
        h2=scan.nextInt();
        m2=scan.nextInt();
        s2=scan.nextInt();
        a=h2-h1;
        b=m2-m1;
        c=s2-s1;
        d=a*60+b;
        if(a==0){
            if(b==0){
                if(c==0) {
                    System.out.printf("%ds",c); }
                else{System.out.printf("%ds",c); }}
            else if(b!=0){
                if(c==0){System.out.printf("%dm",b);}
                else if(c<0){
                c=c+60;
                b=b-1;
                System.out.printf("%dm%ds",b,c);
                }
                else if(c>0){System.out.printf("%dm%ds",b,c);
            }
            }}
        else{c=c+60;
            d=d-1;
            System.out.printf("%dm%ds",d,c);
            }
    }
}

