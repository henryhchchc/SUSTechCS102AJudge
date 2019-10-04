import java.util.Scanner;
public class A1Q2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int h1 =in.nextInt();
        int m1 =in.nextInt();
        int s1 =in.nextInt();
        int h2 =in.nextInt();
        int m2 = in.nextInt();
        int s2 =in.nextInt();
        if(h2 == h1){
            if(m1==m2) {
                int s = s2 - s1;
                System.out.printf("%ds", s);
            }
                else{
                    if(s2>s1) {
                        int m = m2 - m1;
                        int s = s2 - s1;
                        System.out.printf("%dm%ds", m, s);
                    }
                        else if(s2<s1) {
                        int m = m2 - m1 - 1;
                        int s = 60 - s1 + s2;
                        System.out.printf("%dm%ds", m, s);
                    }
                        else {
                        int m = m2 - m1;
                        System.out.printf("%dm", m);
                    }
                }
            }
        else{
            if (m2<m1) {
                if(s2<s1) {
                    int m = (h2-h1-1)*60+ 60 - m1 + m2 - 1;
                    int s = 60 - s1 + s2;
                    System.out.printf("%dm%ds", m, s);
                }
                else if(s1==s2) {
                    int m = (h2-h1-1)*60+(60 - m1 + m2);
                    System.out.printf("%dm", m);
                }
                else if(s1<s2){
                    int m =(h2-h1-1)*60 + (60-m1+m2);
                    int s=s2-s1;
                    System.out.printf("%dm%ds", m, s);
                }
            }
            else if(m2>m1) {
                if(s2>s1){
                    int m=(h2-h1)*60+m2-m1;
                    int s=s2-s1;
                    System.out.printf("%dm%ds", m, s);
                }
                else if(s2==s1){
                    int m=(h2-h1)*60+m2-m1;
                    System.out.printf("%dm", m);
                }
                else if(s2<s1){
                    int m =(h2-h1)*60+m2-m1-1;
                    int s =60-s1+s2;
                    System.out.printf("%dm%ds", m, s);
                }
            }
            else if(m1==m2){
                if(s1<s2){
                    int m=(h2-h1)*60;
                    int s =s2-s1;
                    System.out.printf("%dm%ds", m, s);
                }
                else if(s1==s2){
                    int m=(h2-h1)*60;
                    System.out.printf("%dm", m);
                }
                else if(s1>s2){
                    int m=(h2-h1)*60-1;
                    int s =(60-s1+s2);
                    System.out.printf("%dm%ds", m, s);
                }
            }
        }
        }

    }

