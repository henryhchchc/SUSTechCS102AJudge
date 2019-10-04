import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     int h1,m1,s1,h2,m2,s2,t1,t2,t3,t4,t5;
        h1=input.nextInt();
        m1=input.nextInt();
        s1=input.nextInt();
        h2=input.nextInt();
        m2=input.nextInt();
        s2= input.nextInt();
        t1=h1*3600+m1*60+s1;
        t2=h2*3600+m2*60+s2;
        t3=t2-t1;
        t4=t3/60;
        t5=t3%60;

     if((t3<0)||(h1>24)||(h2>24)||(m1>60)||(m2>60)||(s1>60)||(s2>60))
         System.out.println("wrong");
     else if(t3<60)
         System.out.printf("%ds",t3);
     else if((t3<86400)&&(t5!=0))
         System.out.printf("%dm%ds",t4,t5);
     else if(t3<86400)
         System.out.printf("%dm",t4);
    }
}
