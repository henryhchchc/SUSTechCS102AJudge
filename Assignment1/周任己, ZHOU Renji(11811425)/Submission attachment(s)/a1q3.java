package com.company;

import java.io.EOFException;
import java.util.Scanner;

public class a1q3 {

    public static void main(String[] args) {
        float price,piece,sum=0;
        int a=1,b=0,c=0;

        while(c<args.length){
            price =Float.parseFloat(args[a]);
            piece =Float.parseFloat(args[b]);
            sum=price*piece+sum;
            if(piece%1==0.5){sum++;}
            c+=2;
            a+=2;
            b+=2;
            }

        if(sum%1>0){sum++;}
        System.out.printf("%.1f",sum);
        }
    }

