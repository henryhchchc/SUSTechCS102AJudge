import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int starth = input.nextInt();
        int startm = input.nextInt();
        int starts = input.nextInt();
        int endh = input.nextInt();
        int endm = input.nextInt();
        int ends = input.nextInt();
        int time1 = starth*3600+startm*60+starts;
        int time2 = endh*3600+endm*60+ends;
        int time= time2-time1;
        int m1 = (int) Math.floor(time/60);
        int s1 = time-m1*60;
        if(m1==0&&s1!=0)
            System.out.printf("%ds",s1);
        else if(m1!=0&&s1==0)
                System.out.printf("%dm",m1);
                else if(m1==0&&s1==0)
                    System.out.printf("%ds",s1);
                else
                    System.out.printf("%dm%ds",m1,s1);



    }

}
