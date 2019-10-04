import java.util.Scanner;
public class A1Q2
{
    public static void main(String[]args)
    {
    Scanner input=new Scanner(System.in);
        int seconds1,seconds2;
        int mid;
        int h,m,s;
        h=input.nextInt();
        m=input.nextInt();
        s=input.nextInt();
        h=input.nextInt()-h;
        m=input.nextInt()-m;
        s=input.nextInt()-s;
        seconds1=h*60*60+m*60+s;
        mid=seconds1/60;
        seconds2=seconds1%60;
        if(mid==0)
            System.out.printf("%ds",seconds1);
        else
            if(seconds1==0)
        System.out.printf("%dm",mid);
        else
        System.out.printf("%dm%ds.\n",mid,seconds2);
    }

}
