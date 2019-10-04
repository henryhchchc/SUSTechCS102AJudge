import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int h1=input.nextInt( );
        int m1=input.nextInt( );
        int s1=input.nextInt();
        int h2=input.nextInt();
        int m2=input.nextInt();
        int s2=input.nextInt();
        int mm1,mm2,ss1,ss2;
        mm1=(h2-h1)*60+m2-m1;
        mm2=(h2-h1)*60+m2-m1-1;
        ss1=s2-s1;
        ss2=s2-s1+ 60;
        if(m1==m2&h1==h2&s2>=s1)
            System.out.printf("%ds",ss1);
        else if(s2>s1&m2!=m1)
            System.out.printf("%dm%ds",mm1,ss1);
        else if(s2<s1&m2!=m1){
            if(mm2!=0)
                System.out.printf("%dm%ds",mm2,ss2);
            else System.out.printf("%ds",ss2);}
        else if(s1==s2&m2!=m1)
            System.out.printf("%dm",mm1);
        else if(s1==s2&m2==m1&h1!=h2)
            System.out.printf("%dm",mm1);
    }

}
