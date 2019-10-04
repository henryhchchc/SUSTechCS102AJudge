import java.util.Scanner;

public class A1Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int hour1,min1,sec1,hour2,min2,sec2;
        hour1 = input.nextInt();
        min1 = input.nextInt();
        sec1 = input.nextInt();
        hour2 = input.nextInt();
        min2 = input.nextInt();
        sec2 = input.nextInt();

        int m,s;
        m = (3600*(hour2-hour1)+60*(min2-min1)+(sec2-sec1))/60;
        s = 3600*(hour2-hour1)+60*(min2-min1)+(sec2-sec1)-60*m;
        if((m == 0) & (s != 0))
        System.out.printf("%ds",s);
        else if ((s == 0)&(m != 0))
            System.out.printf("%dm",m);
        else if ((s == 0)&(m == 0))
            System.out.printf("0s");
        else
            System.out.printf("%dm%ds",m,s);




    }

}
