package com.company;

public class a1q4 {

    public static void main(String[] args) {
        int b = 0, a = args.length;
        double c = 0, d = 0, e = 0;

        while (b < a) {
            c = Integer.parseInt(args[b]);
            d = d + c;
            if (e <= c) {
                e = c;
            }
            b++;
        }
        if (e >= 8000 | (d >= 5000 && a >= 10)) {
            System.out.println("Diamond");}
        else{if (e >= 3000 | (d >= 2000 && a >= 10)) {
                System.out.println("Gold"); }
        else{if (e >= 1000 | (d >= 800 && a >= 10)) {
                System.out.println("Silver"); }
        }
        }



    }
}