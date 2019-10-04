
import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hours,mins,secs;
        String time1=sc.nextLine();
        String time2=sc.nextLine();
        String hs1=time1.substring(0,2),hs2=time2.substring(0,2),ms1=time1.substring(3,5),ms2=time2.substring(3,5),ss1=time1.substring(6,8),ss2=time2.substring(6,8);
        int hours1=Integer.parseInt(hs1),hours2=Integer.parseInt(hs2),mins1=Integer.parseInt(ms1),mins2=Integer.parseInt(ms2),secs1=Integer.parseInt(ss1),secs2=Integer.parseInt(ss2);
        hours=hours2-hours1;
        mins=mins2-mins1;
        secs=secs2-secs1;
        int totalsec = hours*3600+mins*60+secs;
        int m=totalsec/60;
        int s=totalsec%60;
        if(m==0 && s!= 0)
        {
            System.out.printf("%ds",s);
        }
        else if (s==0 && m!=0){
            System.out.printf("%dm",m);
        }
        else if (s==0) {
            System.out.printf("%ds",s);
        }
        else
            System.out.printf("%dm%ds",m,s);

    }
}

