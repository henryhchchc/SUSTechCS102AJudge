import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int h1,h2,h3;
        int h,m,s;
        int hh,mm,ss;
        h1=input.nextInt();
        h2=input.nextInt();
        h3=input.nextInt();
        h=input.nextInt();
        m=input.nextInt();
        s=input.nextInt();
        hh=h-h1;
        mm=m-h2;
        ss=s-h3;
        mm=hh*60+mm;
        if (ss==0&&mm==0){
            System.out.print("0s");
        }
        if (ss>0&&mm>0){
            if(ss==60){
                System.out.printf("%sm",mm+1);
            }else{
                System.out.printf("%sm%ss",mm,ss);
            }
        }
        if (ss==0&&mm>0){
            System.out.printf("%sm",mm);
        }
        if (ss>0&&mm==0){
            System.out.printf("%ss",ss);
        }
        if (ss<0&&mm>0){
            if (ss==-60&&mm==1){
                System.out.printf("%ss",0);
            }else{
            if (ss==-60){
                System.out.printf("%sm", mm - 1);
            }else{
            if (mm-1==0)
                System.out.printf("%ss",60+ss);
            if (mm-1>0)
                System.out.printf("%sm%ss",mm-1,60+ss);
            }
            }
        }
    }
}
