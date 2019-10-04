import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int h1=input.nextInt();
        int m1=input.nextInt();
        int s1=input.nextInt();
        int h2=input.nextInt();
        int m2=input.nextInt();
        int s2=input.nextInt();
        double a=(h2-h1)*3600+(m2-m1)*60+(s2-s1);
double b=(int) Math.floor(a/60);
        int s= (int) Math.floor(a-b*60);
int m=(int) b;
 if(m==0) {
     System.out.println(s+"s");
 } else if(s == 0)
        System.out.println(m+"m");
else System.out.println(m+"m"+s+"s");
   }}