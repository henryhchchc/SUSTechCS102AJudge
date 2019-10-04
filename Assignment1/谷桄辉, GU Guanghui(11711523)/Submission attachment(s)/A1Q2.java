import java.util.Scanner;

public class A1Q2 {
    public static void main(String []args){
        int h1,m1,s1;
        Scanner scan = new Scanner(System.in);
        h1=scan.nextInt();
        m1=scan.nextInt();
        s1=scan.nextInt();
        Scanner sc=new Scanner(System.in);
        int h2,m2,s2;
        h2=sc.nextInt();
        m2=sc.nextInt();
        s2=sc.nextInt();
        int s3=3600*(h2-h1)+60*(m2-m1)+s2-s1;
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

