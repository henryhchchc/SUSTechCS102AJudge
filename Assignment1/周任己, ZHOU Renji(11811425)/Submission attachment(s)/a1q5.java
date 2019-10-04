package com.company;

public class a1q5 {

    public static void main(String[] args) {
    int a=args.length,b=0,e;
    String  c,d,f="6.",g="9.";

    while (b < a) {
            c = args[b];
            d=c.substring(c.lastIndexOf(".")-1,c.lastIndexOf("."));
            e=Integer.parseInt(d);
            if (e==2) {c=c.replace("2.",f);
            System.out.printf("%s ",c);
            }
            if (e==4) {c=c.replace("4.",g);
                System.out.printf("%s ",c);
            }
            b++;
        }
    }
}
