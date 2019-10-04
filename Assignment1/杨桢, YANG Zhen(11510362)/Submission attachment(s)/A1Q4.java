package com.company;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class A1Q4{
        public static void main(String []args){
                Scanner input = new Scanner(System.in);
                int consumptionsCounter=-1;
                float amount=0;
                float consumptions;
                System.out.print("Enter consumptions or 0 to quit: ");
                consumptions=input.nextFloat();

                while (consumptions!=0){
                        amount+=consumptions;
                        consumptionsCounter++;
                        System.out.println("Enter consumptions or 0 to quit: ");
                        consumptions= input.nextInt();




                        if(consumptionsCounter!=-1) {
                                int number = consumptionsCounter;
                                if (number >= 10) {
                                        if (amount >= 5000) {
                                                System.out.println("diamond");
                                        } else if (amount >= 2000) {
                                                System.out.println("gold");
                                        } else if (amount >= 800) {
                                                System.out.println("silver");
                                        } else System.out.println("no vip");
                                } else if (number >= 5) {
                                        if (consumptions >= 8000) {
                                                System.out.println("diamond");
                                        } else if (amount >= 2000) {
                                                System.out.println("gold");
                                        } else if (amount >= 800) {
                                                System.out.println("silver");
                                        } else System.out.println("no vip");

                                } else
                                      if(number>=2){
                                              if(consumptions>=8000){
                                                      System.out.println("diamond");
                                              } else if (consumptions >= 3000) {
                                                      System.out.println("gold");
                                              } else if (amount >= 800) {
                                                      System.out.println("silver");
                                              } else System.out.println("no vip");
                                              }
                                      else  if(consumptions>=8000){
                                        System.out.println("diamond");
                                } else if (consumptions >= 3000) {
                                        System.out.println("gold");
                                } else if (consumptions >= 1000) {
                                        System.out.println("silver");
                                } else
                                        System.out.println("no vip");
                                      }


                }

        }
}




