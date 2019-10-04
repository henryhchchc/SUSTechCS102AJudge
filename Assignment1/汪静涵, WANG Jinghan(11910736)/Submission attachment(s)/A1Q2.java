

import java.util.Scanner;

public class A1Q2 {
    public static void main(String [] args){
//        Calculate the waiting time of users from the beginning to queue up to finding a seat.
//        The beginning and end time will be passed in " hh mm ss "format.
//        The three numbers are separated by spaces.
//        Output is in " xx m xx s" format.

        //input
        Scanner input= new Scanner(System.in);

        int h1=input.nextInt();                      //input beginning time
        int m1=input.nextInt();
        int s1=input.nextInt();

        int h2=input.nextInt();                      //input end time
        int m2=input.nextInt();
        int s2=input.nextInt();

        //calculate
        //calculate s
        int s =s2-s1;
        if(s<0)
        {
            s+=60;
            m2--;
        }
        //calculate m
        int m=m2-m1+60*(h2-h1);

        //output
        //if m=0,only s
        if(m==0)
        {System.out.printf("%ds",s);}
        //if m!=0&&s=0,only m
        else
        {
            if(s==0)
            {System.out.printf("%dm",m);}
        //else xx m xx s
            else
            {System.out.printf("%dm%ds",m,s);}
        }


    }//end main
}
