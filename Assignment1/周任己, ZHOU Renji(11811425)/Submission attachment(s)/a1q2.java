package com.company;

import java.util.Scanner;

public class a1q2 {

    public static void main(String[] args) {

        int h1, m1, s1, h2, m2, s2, time1, time2, wt, m, s;
        Scanner input =new Scanner(System.in);
        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();

        time1 = 3600 * h1 + 60 * m1 + s1;
        time2 = 3600 * h2 + 60 * m2 + s2;
        wt = time2 - time1;
        m = wt / 60;
        s = wt % 60;

        if (m == 0 & s != 0) {
            System.out.printf("%ds", s);
        } else if (s == 0 & m != 0) {
            System.out.printf("%dm", m);
        } else if (m == 0 & s == 0) {
            System.out.printf("%ds", s);
        } else {
            System.out.printf("%dm %ds", m, s);
        }
    }
}
