package com.company;

public class A1Q5 {

    public static void main(String[] args) {
        int i;
        for(i=0;i<args.length;i++) {}
        int a;
        Double c;
        Double d;
        Double e;
        for (a=0;a<i;a++) {
            Double b = Double.parseDouble(args[a]);
            c=b-0.9;
            for (d=c;d>10;d=d-10){}
            if(d==2.0){
                e=b+4;
                System.out.println(e);}
            else if(d==4.0){
                 e=b+5;
                 System.out.println(e);}
             else{}
        }
        }
}
