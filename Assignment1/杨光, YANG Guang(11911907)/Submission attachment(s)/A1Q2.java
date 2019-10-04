import java.util.Scanner;
public class A1Q2 {

    public static void main(String[] args){
    int hh1;int mm1;int ss1;int hh2;int mm2;int ss2;int hh;int mm;int ss;
    Scanner input = new Scanner(System.in);
    hh1= input.nextInt();
         mm1 = input.nextInt();
         ss1 = input.nextInt();
          hh2 = input.nextInt();
           mm2 = input.nextInt();
        ss2 = input.nextInt();
      hh=hh2-hh1;mm=mm2-mm1;ss=ss2-ss1;
     if(hh==0&&mm==0&&ss==0)System.out.print("0s");
        if(hh==0&&mm==0&&ss!=0)System.out.printf("%ss",ss);
        if(hh==0&&mm!=0&&ss==0)System.out.printf("%sm",mm);
        if(hh!=0&&mm==0&&ss==0)System.out.printf("%sh",hh);
        if(hh==0&&mm!=0&&ss!=0){if(ss<0){mm=mm-1;ss=ss+60;
        if(mm!=0)System.out.printf("%sm%ss",mm,ss);
            System.out.printf("%ss",ss); }
                System.out.printf("%sm%ss",mm,ss);}
        if(hh!=0&&mm!=0&&ss==0){mm=hh*60+mm;System.out.printf("%sm",mm);}
        if(hh!=0&&mm==0&&ss!=0){ss=hh*3600+ss;System.out.printf("%ss",ss);}
        if(hh!=0&&mm!=0&&ss!=0){mm=hh*60+mm;if(ss<0){mm=mm-1;ss=ss+60;
            if(mm!=0)System.out.printf("%sm%ss",mm,ss);
          else  System.out.printf("%ss",ss); }
          else System.out.printf("%sm%ss",mm,ss);}
    }
}
