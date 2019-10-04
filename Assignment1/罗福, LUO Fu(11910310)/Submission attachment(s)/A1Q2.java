import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] agrs){
        Scanner oo = new Scanner(System.in);
        System.out.println("");
        int h1 = oo.nextInt();
        int m1 = oo.nextInt();
        int s1 = oo.nextInt();
        System.out.println("");
        int h2 = oo.nextInt();
        int m2 = oo.nextInt();
        int s2 = oo.nextInt();

        int ss = 0;
        int mm;

        if(h1==h2&&m1==m2&&s1==s2){
                System.out.print("0s");}
        else if(h1==h2&&m1==m2&&s2>s1){
                ss = s2-s1;
            System.out.printf("%ds",ss);}
            else if (h1==h2&&m2 > m1 && s1 == s2){
                    mm = m2 - m1;
                System.out.printf("%dm", mm);}
            else if (h1==h2&&m2 > m1&& s1> s2){
                ss = s2- s1+60;
                mm = m2 - m1 -1;
            System.out.printf("%dm%ds",mm,ss);}
            else if(h1==h2&&m2> m1 ){
                ss = s2-s1;
                mm = m2-m1;
            System.out.printf("%dm%ds",mm,ss);}
            else if(h1<h2&&m1==m2&&s1==s2){
                mm = (h2-h1)*60;
            System.out.printf("%dm",mm);
        }else if(h1<h2&&m1==m2&&s1<s2){
            mm = (h2-h1)*60;
            ss = s2-s1;
            System.out.printf("%dm%ds",mm,ss);
        }else if(h1<h2&&m1==m2&&s1>s2){
            mm = (h2-h1)*60 - 1;
            ss = s2-s1+60;
            System.out.printf("%dm%ds",mm,ss);
        }else if(h1<h2&&m1>m2&&s1==s2){
            mm = (h2-h1)*60+(m2-m1);
            System.out.printf("%dm",mm);
        }else if(h1<h2&&m1>m2&&s1<s2){
            mm = (h2-h1)*60+m2-m1;
            ss = s2-s1;
            System.out.printf("%dm%ds",mm,ss);
        }else if(h1<h2&&m1>m2&&s1>s2){
            mm = (h2-h1)*60+m2-m1-1;
            ss = s2-s1+60;
            System.out.printf("%dm%ds",mm,ss);
        }else if(h1<h2&&m1<m2&&s1==s2){
            mm = (h2-h1)*60+m2-m1;
            System.out.printf("%dm",mm);
        }else if(h1<h2&&m1<m2&&s1>s2){
            mm = (h2-h1)*60+m2-m1-1;
            ss = s2-s1+60;
            System.out.printf("%dm%ds",mm,ss);
        }else if(h1<h2&&m1<m2&&s1<s2){
            mm = (h2-h1)*60+ m2- m1;
            ss = s2-s1;
            System.out.printf("%dm%ds",mm,ss);
        }






        }

            }






