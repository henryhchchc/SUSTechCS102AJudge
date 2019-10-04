

import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int firsthour;
        int firstminite;
        int firstsecend;
        int lasthour;
        int lastminite;
        int lastsecend;
        int sum1;
        int sum2;

        firsthour = in.nextInt();
        firstminite = in.nextInt();
        firstsecend = in.nextInt();
        lasthour = in.nextInt();
        lastminite = in.nextInt();
        lastsecend = in.nextInt();
        sum1 = firsthour*3600 + firstminite*60 + firstsecend;
        sum2 = lasthour*3600 + lastminite*60 + lastsecend;
        if ((sum2-sum1)/60 >0  && (sum2-sum1)%60!=0)
            System.out.println((sum2-sum1)/60+"m"+(sum2-sum1)%60+"s");
        else if ((sum2-sum1)/60==0)
            System.out.println((sum2-sum1)%60+"s");
        else if ((sum2-sum1)/60 >0  && (sum2-sum1)%60==0)
            System.out.println((sum2-sum1)/60+"m");


    }
}
