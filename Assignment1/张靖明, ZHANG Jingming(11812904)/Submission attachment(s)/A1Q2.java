
import java.util.Scanner;
public class A1Q2 {
    public static void main(String [] args)	{
        Scanner in=new Scanner(System.in);
         int n = 0;
         do {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = 3600*a+60*b+c;
            int e = in.nextInt();
            int f = in.nextInt();
            int g = in.nextInt();
            int h = 3600*e+60*f+g;
            int i = (h-d)/60;
            int j = (h-d)-(60*i);
            n++;
            if (i==0 ){
                System.out.print(j+"s");
            }
            else if (j==0&&i!=0){
                System.out.print(i+"m");}
            else
                System.out.print(i+"m"+j+"s");

        } while(n<1) ;

}
}
