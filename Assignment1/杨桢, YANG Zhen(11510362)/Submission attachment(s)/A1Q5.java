package com.company;

        import org.w3c.dom.css.Counter;

        import java.sql.Array;
        import java.util.Scanner;

public class A1Q5 {

    public static void main(String[] args) {
        double p1, p2, p3, p4, p5, p6;
        int q1, q2, q3, q4, q5, q6;
        int d1, d2, d3, d4, d5, d6;
        Scanner input = new Scanner(System.in);
        p1 = input.nextDouble();
        p2 = input.nextDouble();
        p3 = input.nextDouble();
        p4 = input.nextDouble();
        p5 = input.nextDouble();
        p6 = input.nextDouble();
        q1= (int) Math.floor(p1);
        q2= (int) Math.floor(p2);
        q3= (int) Math.floor(p3);
        q4= (int) Math.floor(p4);
        q5= (int) Math.floor(p5);
        q6= (int) Math.floor(p6);
        d1=q1%10;
        d2=q2%10;
        d3=q3%10;
        d4=q4%10;
        d5=q5%10;
        d6=q6%10;
          if(d1==2){p1+=4;
            System.out.println(p1);}
        else
        if(d1==4){p1+=5;
            System.out.println(p1); }
        else
            System.out.println();
        if(d2==2){p2+=4;
            System.out.println(p2);}
        else
        if(d2==4){p2+=5;
            System.out.println(p2); }
        else
            System.out.println();
        if(d3==2){p3+=4;
            System.out.println(p3);}
        else
        if(d3==4){p3+=5;
            System.out.println(p3); }
        else
            System.out.println();
        if(d4==2){p4+=4;
            System.out.println(p4);}
        else
        if(d4==4){p4+=5;
            System.out.println(p4); }
        else
            System.out.println();
        if(d5==2){p5+=4;
            System.out.println(p5);}
        else
        if(d5==4){p5+=5;
            System.out.println(p5); }
        else
            System.out.println();
        if(d6==2){p6+=4;
            System.out.println(p6);}
        else
        if(d6==4){p6+=5;
            System.out.println(p6); }
        else
            System.out.println();



    }
}