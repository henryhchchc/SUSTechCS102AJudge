import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        int h1,m1,s1,h2,m2,s2,h,m,s,m3;
        Scanner input = new Scanner(System.in);
       h1 = input.nextInt();
       m1 = input.nextInt();
       s1 = input.nextInt();
       h2 = input.nextInt();
       m2 = input.nextInt();
       s2 = input.nextInt();
       h = h2 - h1;
       m = m2 - m1;
       s = s2 - s1;
       m3 = h*60+m;
       if(s>0) {
           System.out.printf("%dm%ds", m3, s);
       }else if (s<0) {
           s += 60;
           m3 = m3 - 1;
           System.out.printf("%dm%ds", m3, s);
       }else {
           System.out.printf("%dm",m3);
       }


       }





    }

