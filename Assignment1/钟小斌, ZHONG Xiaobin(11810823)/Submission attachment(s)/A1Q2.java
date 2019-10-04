import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int a,b,c,d,e,f,g,h,i;
       a=scan.nextInt();//start time(hour)
       b=scan.nextInt();//start time(minute)
       c=scan.nextInt();//start time(second)
       d=scan.nextInt();//end time(hour)
       e=scan.nextInt();//end time(minute)
       f=scan.nextInt();//end time(second)
       g=(d-a)*3600+(e-b)*60+f-c;
       h=g/60;
       i=g%60;
       if(h==0){
           if(i==0){
               System.out.println("0s");
           }
           else System.out.println(i+"s");
       }
       else if(i==0){
           System.out.println(h+"m");
       }
       else System.out.println(h+"m"+i+"s");
    }
}
