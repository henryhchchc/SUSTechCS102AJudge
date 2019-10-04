package com.company;

import java.util.Scanner;

public class a1q1 {

    public static void main(String[] args) {

        //receive user name and student id
        String name;
        int id;
        Integer a;

        System.out.println("Please enter your name and student id:");
        name = args[0];
        a = Integer.parseInt(args[1]);
        id= a;

        //judge weather id is right

        int number = id;
        String temp = String.valueOf(number);
        temp = temp.substring(0, 3);//from the first digit,cut out 3 digits
        number = Integer.parseInt(temp);
        boolean id3;
        switch (number) {
            case (115):
            case (117):
            case (116):
            case (118):
            case (119):
                id3 = true;
                break;
            default:
                id3 = false;
        }

        //right,print
        if ((id >= 10000000 && id <= 99999999) && id3) {
            System.out.printf("%s,welcome to SUSTECH Hot Pot Restaurant!",name);
        }

        //false,display the wrong id
        else {
            System.out.printf("%d", id);
        }

    }
}
