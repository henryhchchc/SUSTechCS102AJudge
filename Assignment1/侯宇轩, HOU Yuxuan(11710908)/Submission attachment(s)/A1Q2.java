import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int h1,m1,s1,h2,m2,s2,t,m,s;
        h1=input.nextInt();
        m1=input.nextInt();
        s1=input.nextInt();
        h2=input.nextInt();
        m2=input.nextInt();
        s2=input.nextInt();
        t=3600*h2+60*m2+s2-3600*h1-60*m1-s1;
        m=t/60;
        s=t-60*m;
        if(m==0)
            System.out.printf("%ds",s);
        else if(s==0)
            System.out.printf("%dm",m);
        else
            System.out.printf("%dm%ds",m,s);




    };



}




