import java.util.Scanner;

public class A1Q2 {
    public static void main(String[]args){
        int h ;
        int m ;
        int s ;
        int h1 ;
        int m1 ;
        int s1 ;
        Scanner scan = new Scanner(System.in);
        h=scan.nextInt(); m=scan.nextInt(); s=scan.nextInt();
        h1=scan.nextInt(); m1=scan.nextInt(); s1=scan.nextInt();
        int ss = h*3600+m*60+s;
        int ss1 = h1 *3600+m1*60+s1;
        int c = ss1-ss;
        int min ;
        int second;
        second = c % 60;
        min = (c- second)/60;
        if (min==0 && second==0){
            System.out.print("0s");
        }
        if (min==0 && second!=0 ) {
            System.out.print(second + "s");
        }
        if (second==0 && min!=0) {
            System.out.print(min + "m");
        }
        if (second!=0 && min!=0){
            System.out.print(min+"m"+second+"s");
        }

    }
}
