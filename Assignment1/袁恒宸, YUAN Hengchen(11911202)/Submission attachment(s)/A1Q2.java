import java.util.Scanner;
public class A1Q2 {
    public static void main (String args[]) {
        Scanner sb = new Scanner(System.in);
        String time1= sb.nextLine();
        String time2= sb.nextLine();
        String time3= time1.replace(" ","");
        String time4= time2.replace(" ","");
        String hour1=time3.substring(0,2);
        String hour2=time4.substring(0,2);
        String min1=time3.substring(2,4);
        String min2=time4.substring(2,4);
        String sec1=time3.substring(4,6);
        String sec2=time4.substring(4,6);
        int h1= Integer.parseInt(hour1);
        int h2= Integer.parseInt(hour2);
        int m1= Integer.parseInt(min1);
        int m2= Integer.parseInt(min2);
        int s1= Integer.parseInt(sec1);
        int s2= Integer.parseInt(sec2);
        int cha=3600*(h2-h1)+60*(m2-m1)+s2-s1;
        int fenzhong=cha/60;
        int miao=cha%60;
        if (miao==0)
        {if ( fenzhong==0)
        {System.out.print("0s");}
        else
        {System.out.printf("%dm",fenzhong);}}
else
    if (fenzhong==0)
        System.out.printf("%ds",miao);
    else
    System.out.printf("%dm%ds",fenzhong,miao);
    }
}
