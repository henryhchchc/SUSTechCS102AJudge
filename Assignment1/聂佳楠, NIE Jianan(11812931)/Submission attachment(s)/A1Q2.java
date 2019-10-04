import java.util.Scanner;
public class A1Q2 {
public static void main(String[] args){
    int a,b,c,x,y,z,t,m,s;
    Scanner input=new Scanner(System.in);
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
    x=input.nextInt();
    y=input.nextInt();
    z=input.nextInt();

    t=(x-a)*3600+(y-b)*60+(z-c);
    m=t/60;s=t-60*m;

    while(m==0||s==0) {
        if (m == 0)
            System.out.printf("%ds", s);
        else
            System.out.printf("%dm", m);break; }

    while (m!=0&&s!=0) { System.out.printf("%dm%ds.",m,s);break;}
}
}
