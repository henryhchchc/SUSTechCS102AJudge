package com.company;

import java.util.Scanner;

public class A1Q2 {
        public static void main(String[] args) {
            int H1, M1, S1, H2, M2, S2, H, M, S, T;
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the beginning time and end time:");
            H1 = input.nextInt();
            M1 = input.nextInt();
            S1 = input.nextInt();
            H2 = input.nextInt();
            M2 = input.nextInt();
            S2 = input.nextInt();
            H = H2 - H1;
            M = M2 - M1;
            S = S2 - S1;
            if (S >= 0) {
                {
                    if (M >= 0) {
                        System.out.println( H + "h" + M + "m" + S+"s");
                    } else
                        System.out.println( H + "h" + (M + 60) + "m" + S+"s");
                }
            } else if (M >= 1 ) {
                System.out.println( H + "h" + (M - 1) + "m" + (S + 60)+"s");
            } else
                System.out.println((H - 1) + "h" + (M + 59) + "m" + (S + 60)+"s");


        }
        }
