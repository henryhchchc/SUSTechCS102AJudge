import java.util.Scanner;
public class A1Q2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a,b,c,d,e,f,g,h,i,j,k;
        a= input.nextInt();
        b= input.nextInt();
        if (a==0&&b==0){
            System.out.println("0");
        }
        c= input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        f=input.nextInt();

        g=c+60*b+3600*a;
        h=f+60*e+3600*d;
        i=h-g;
        j=i%60;
        k=i/60;
        if (k!=0&&j!=0){
            System.out.printf("%dm%ds",k,j);
        }else if (k!=0&&j==0){
            System.out.printf("%dm",k);

        }else if(k==0){
            System.out.printf("%ds",j);
        }
    }
}

