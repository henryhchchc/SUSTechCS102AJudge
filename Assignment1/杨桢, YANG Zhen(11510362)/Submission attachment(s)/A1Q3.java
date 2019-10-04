package com.company;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Q3{
    public static void main(String[] args) {
        double p1, a1, p2, a2, p3, a3, p4, a4, t1, t2, t3, t4, T1, T2, T3, T4, T;

        Scanner input = new Scanner(System.in);
        p1 = input.nextDouble();
        a1 = input.nextDouble();
        p2 = input.nextDouble();
        a2 = input.nextDouble();
        p3 = input.nextDouble();
        a3 = input.nextDouble();
        p4 = input.nextDouble();
        a4 = input.nextDouble();
        if (Math.floor(a1)<a1){
           t1=p1/2+1;
            T1=Math.floor(a1)*p1+Math.ceil(t1);
            }
        else T1=p1*a1;
        if (Math.floor(a2)<a2){
            t2=p2/2+1;
            T2=Math.floor(a2)*p2+Math.ceil(t2);
        }
        else T2=p2*a2;
        if (Math.floor(a3)<a3){
            t3=p3/2+1;
            T3=Math.floor(a3)*p3+Math.ceil(t3);
        }
        else T3=p3*a3;
        if (Math.floor(a4)<a4){
            t4=p4/2+1;
            T4=Math.floor(a4)*p4+Math.ceil(t4);
        }
        else T4=p4*a4;
        T=T1+T2+T3+T4;
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println(df.format(T));
    }
}




