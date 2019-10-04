import  java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 ,n2,n3,n4,n5,n6,sum1,sum2,sum3,m,s;
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();
        n6 = input.nextInt();
        sum1 = n1*3600+n2*60+n3;
        sum2 = n4*3600+n5*60+n6;
        sum3 =sum2-sum1;
        m = sum3/60;
        s = sum3%60;
        if( m == 0)
            System.out.println(s+"s");
        else
            if(s == 0)
                System.out.println(m+"m");
            else
                System.out.println(m+"m"+s+"s");
    }
}

