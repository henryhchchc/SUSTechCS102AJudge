import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        int h1,h2,m1,m2,s1,s2;
        int m3,s3;

        Scanner input = new Scanner(System.in);
        h1=input.nextInt();
        m1=input.nextInt();
        s1=input.nextInt();
        h2=input.nextInt();
        m2=input.nextInt();
        s2=input.nextInt();
        m3=(h2-h1)*60+(m2-m1);
        s3=s2-s1;
        if (s3<0) {
            s3 +=60;
            m3 -=1;
        }
        if(m3==0 && s3==0) {
            System.out.println("0s");
        }
        else if (m3==0 && s3!=0){
            System.out.printf("%ds",s3);
        }
        else if (m3!=0 && s3==0){
            System.out.printf("%dm",m3);
        }
        else System.out.printf("%dm%ds",m3,s3);

    }
}
