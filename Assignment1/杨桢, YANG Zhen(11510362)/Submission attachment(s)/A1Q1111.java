package com.company;

import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name:");
        String Name=input.nextLine();
        System.out.println("enter your student ID:");
        int ID=input.nextInt();
        if (ID<11500000)
            System.out.println(ID);
        else if (ID>11999999)
            System.out.println( ID);
        else
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!" , Name);

    }
}
