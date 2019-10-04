import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int h1,h2,m1,m2,s1,s2,time,m,s;
        h1 = ip.nextInt();
        m1 = ip.nextInt();
        s1 = ip.nextInt();
        h2 = ip.nextInt();
        m2 = ip.nextInt();
        s2 = ip.nextInt();
        time = (h2-h1)*3600+(m2-m1)*60+s2-s1;
        m = time/60;
        s = time%60;
        if(m!=0)    System.out.printf("%dm",m);
        if(m!=0 && s==0);
        else    System.out.printf("%ds",s);
    }
}