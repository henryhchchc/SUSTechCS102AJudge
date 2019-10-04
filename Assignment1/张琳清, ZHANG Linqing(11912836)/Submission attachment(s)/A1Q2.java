import java.util.Scanner;
public class A1Q2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int hh1=input.nextInt();
        int mm1=input.nextInt();
        int ss1=input.nextInt();
        int hh2=input.nextInt();
        int mm2=input.nextInt();
        int ss2=input.nextInt();
        int m;
        int s;
        int n;
        n=(hh2-hh1)*3600+(mm2-mm1)*60+(ss2-ss1);
        m=n/60;
        s=n%60;
        if (m==0&&s==0){System.out.printf("0s");}
        if(m!=0&&s==0){System.out.printf(m+"m");}
        if (m==0&&s!=0){System.out.printf(s+"s");}

        if (m!=0&&s!=0){System.out.printf(m+"m"+s+"s");}
    }
}
