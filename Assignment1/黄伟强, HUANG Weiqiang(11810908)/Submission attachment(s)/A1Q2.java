import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a= new int[6];
        int i;
        for(i=0;i<6;i++)
            a[i]=sc.nextInt();
        int b, c, d, e;
        b=(a[3]-a[0])*60+a[4]-a[1];
        c=b*60+a[5]-a[2];
        d=c/60;
        e=c%60;
        if(d==0&&e==0)
            System.out.print("0s");
        if(d==0&&e!=0)
            System.out.printf("%ds",e);
        if(d!=0&&e==0)
            System.out.printf("%dm",d);
        if(d!=0&&e!=0)
            System.out.printf("%dm%ds",d,e);
    }
}
