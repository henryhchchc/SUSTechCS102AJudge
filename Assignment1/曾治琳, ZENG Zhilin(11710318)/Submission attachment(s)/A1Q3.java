package com.company;

import java.util.Scanner;

public class A1Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the price and the number of copies or -1 and 0 to quit:");
    double price=input.nextDouble();
    float copies=input.nextFloat();
        double a = Math.floor(copies);
        double sum=price * copies+copies*2-a*2;
    while (price>0){
        System.out.print("Please enter the price and the number of copies or -1 and 0 to quit:");
        price=input.nextDouble();
        copies=input.nextFloat();
        a = Math.floor(copies);
        sum=sum+price * copies+copies*2-a*2;
    };
                System.out.printf("%s",sum);
  }
}
