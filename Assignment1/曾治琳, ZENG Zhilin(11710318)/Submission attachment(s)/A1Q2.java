package com.company;

import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        int hour1;
        int minute1;
        int second1;
        int hour2;
        int minute2;
        int second2;
        int number1;
        int number2;
        int number3;
        int number4;
        Scanner lalala=new Scanner(System.in);
        System.out.print("enter your start time: ");
        hour1=lalala.nextInt();
        minute1=lalala.nextInt();
        second1=lalala.nextInt();
        System.out.print("enter your finish time: ");
        hour2=lalala.nextInt();
        minute2=lalala.nextInt();
        second2=lalala.nextInt();
        number1=hour2*60-hour1*60+minute2-minute1;
        number2=second2-second1;
        number3=hour2*60-hour1*60+minute2-minute1-1;
        number4=second2-second1+60;
        if (number1==0)
            System.out.printf("%ss",number2);
        else if(number2>0)
            System.out.printf("%dm%ds",number1,number2);
        else if (number2<0)
            System.out.printf("%dm%ds",number3,number4);
        else
            System.out.printf("%dm",number1);

    }
}
