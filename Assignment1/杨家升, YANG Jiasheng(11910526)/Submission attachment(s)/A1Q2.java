import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int h1,m1,s1,h2,m2,s2,sum,m,s,h;
        h1 = input.nextInt();
        m1= input.nextInt();
        s1= input.nextInt();
        h2= input.nextInt();
        m2= input.nextInt();
        s2= input.nextInt();
        s=s2-s1;
        m=m2-m1;
        h=h2-h1;
        if(s>0){
            m=m+60*h;
            System.out.println(m+"m"+s+"s");
        }else if(s<0){
            s=s+60;
            m=m-1+60*h;
            System.out.println(m+"m"+s+"s");
        }else System.out.println(s+"s");


}}