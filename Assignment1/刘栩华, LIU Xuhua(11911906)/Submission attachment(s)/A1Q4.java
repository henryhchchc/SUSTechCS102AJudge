package com.company;

import java.util.Scanner;

public class A1Q4 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please input the amout of consumption in turn: ");
        int a;
        Double b;
        Double c=0.0;
        for(a=0;a<4;a++){
            b=input.nextDouble();
            c=c+b;}
        if(c>=5000)
            System.out.print("Diamond");
        else if(c>=2000)
            System.out.print("Gold");
        else if(c>=800)
            System.out.print("Silver");
        else{}
    }
}
