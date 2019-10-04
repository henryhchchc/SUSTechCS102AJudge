import java.util.Scanner;

public class A1Q2 {
    public static void main(String []args){
        int H1,M1,S1;
        Scanner scan = new Scanner(System.in);
        H1=scan.nextInt();
        M1=scan.nextInt();
        S1=scan.nextInt();
        Scanner sc=new Scanner(System.in);

        int h1,m1,s1;
        h1=sc.nextInt();
        m1=sc.nextInt();
        s1=sc.nextInt();

        int s3=3600*(h1-H1)+60*(m1-M1)+s1-S1;
        int s=s3%60;
        int m=(s3-s)/60;

        if (m!=0) {
            if (s!=0){
            System.out.print(m + "m" + s + "s");}
            else
                System.out.print(m + "m");
        }
        else System.out.print(s+"s");
        }
    }

