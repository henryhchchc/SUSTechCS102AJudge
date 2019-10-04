import java.util.*;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, f, g, h;
        a = input.nextInt();//h1
        b = input.nextInt();//m1
        c = input.nextInt();//s1
        d = input.nextInt();//h2
        e = input.nextInt();//m2
        f = input.nextInt();//s2
        g=(d-a)*60+(e-b);
        h=f-c;
        if(h<60&&h>0) {
            System.out.printf(g + "m" + h + "s");
        }
        else if (h==0){if(g!=0){
            System.out.printf(g + "m");}
            if (g==0){System.out.printf(h+ "s");
        }
else  if(h<0){
    g=g-1;h=h+60;
            System.out.printf(g + "m" + h + "s");
        }
else if(h==60) {
    g=g+1;h=h-60;
            System.out.printf(g + "m");
        }
else if(g==0){System.out.printf(h + "s");}
        }
    }}