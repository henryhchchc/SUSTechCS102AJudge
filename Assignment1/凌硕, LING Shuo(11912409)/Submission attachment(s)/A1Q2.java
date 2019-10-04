import java.util.Scanner;
public class A1Q2{
  public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     int a;int b;int c;int d;int e;int f;int g;int h;int i;int j;int k;int l;
     a=input.nextInt();
     b=input.nextInt();
     c=input.nextInt();
     d=input.nextInt();
     e=input.nextInt();
     f=input.nextInt();
         g=d-a;
         h=e-b;
         i=f-c;
         j=g*3600+h*60+i;        //计算时间总秒数为j
         if(j<60)
         {System.out.printf("%ds", j);}
         else {
             k = j / 60;
             l = j % 60;
             if (l == 0) {
                 System.out.printf("%dm", k);
             } else {
                 System.out.printf("%dm%ds", k, l);
             }
         }
  }
}
