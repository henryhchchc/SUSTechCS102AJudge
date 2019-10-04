

import java.util.Scanner;


public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h1,h2,m1,m2,s1,s2;
        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();
        if((h1-h2)==0&&(m1-m2)==0&&(s1-s2)==0){
            System.out.print("0s");
        }else{
            int m =(3600*h2+60*m2+s2-3600*h1-60*m1-s1)/60;
            int s = 3600*h2+60*m2+s2-3600*h1-60*m1-s1-60*m;
            if((m1-m2)!=0){System.out.print(m+"m");}
            if((s1-s2)!=0){System.out.print(s+"s");}
        }
    }
}
