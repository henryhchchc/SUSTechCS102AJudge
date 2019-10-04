import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
     int a;
     int b;
     int c;
     int d;
     int e;
     int f;
     int time1;
     int time2;
     int dt = 0;
     int min;
     int hour;
     int left;
     int second;
     Scanner input=new Scanner(System.in);
     a=input.nextInt();
     b=input.nextInt();
     c=input.nextInt();
     d=input.nextInt();
     e=input.nextInt();
     f=input.nextInt();
     time1=3600*a+b*60+c;
     time2=3600*d+e*60+f;
     if((time2 >= time1) && (a <= 24) && (d <= 24) && (b <= 60) && (e <= 60) && (c <= 60) && (f <= 60))
         dt=time2-time1;
         min=dt/60;
         second=dt-60*min;
         if ((time2 >= time1)&&(min==0)&&(second==0))
             System.out.println("0s");
         if((time2 >= time1)&&(min>0)&&(second==0))
             System.out.printf("%sm\n",min);
         if ((time2 >= time1)&&(min==0)&&(second>0))
             System.out.printf("%ss\n",second);
         if ((time2 >= time1)&&(min>0)&&(second>0))
             System.out.printf("%sm%ss\n",min,second);
     }
    }

