import java.util.Scanner;

public class A1Q2 {

        public static void main(String[] args) {
            int h1,m1,s1;
            int h2,m2,s2;
            int mm,ss;

            Scanner input = new Scanner(System.in);

            h1 = input.nextInt();
            m1 = input.nextInt();
            s1 = input.nextInt();
            h2 = input.nextInt();
            m2 = input.nextInt();
            s2 = input.nextInt();
            if (s1==s2&&(m1!=m2||h1!=h2)){
                mm = (h2 - h1) * 60 + m2 - m1;
                System.out.printf("%dm",mm);}
            else if (s1>s2){
                ss = 60+s2-s1;
                mm=(h2-h1)*60+m2-m1-1;
                System.out.printf("%dm%ds",mm,ss);}
            else if (s1<s2&&m1!=m2){
                ss = s2-s1;
                mm = (h2 - h1) * 60 + m2 - m1;
                System.out.printf("%dm%ds",mm,ss);}
            else if (h1==h2&&m1==m2){
                ss = s2-s1;
                System.out.printf("%ds",ss);


        }
    }

}
