import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int hour1;
        int min1;
        int sec1;
        int hour2;
        int min2;
        int sec2;
        int min3;
        int sec3;
        int time;

        hour1 =input.nextInt();
        min1 =input.nextInt();
        sec1=input.nextInt();
        hour2=input.nextInt();
        min2=input.nextInt();
        sec2=input.nextInt();

        if (hour1==hour2)
        {
            if (min1==min2)
            {
                time=sec2-sec1;
                System.out.printf("%ds",time);
            }
            else {
                if (sec1 > sec2) {
                    min3 = min2 - min1 - 1;
                    sec3 = 60 - sec1 + sec2;
                    System.out.printf("%dm%ds",min3,sec3);
                } else {
                    min3 = min2 - min1;
                    sec3 = sec2 - sec1;
                    System.out.printf("%dm%ds",min3,sec3);
                }
            }
        }else{
            if (min1==min2)
            {
                min3=60*(hour2=hour1);
                sec3=sec2-sec1;
                System.out.printf("%dm%ds",min3,sec3);
            }
            else {
                if (sec1 > sec2) {
                    min3 = min2 - min1 - 1+(hour2-hour1)*60;
                    sec3 = 60 - sec1 + sec2;
                    System.out.printf("%dm%ds",min3,sec3);
                } else if(sec1<sec2){
                    min3 = min2 - min1+(hour2-hour1)*60;
                    sec3 = sec2 - sec1;
                    System.out.printf("%dm%ds",min3,sec3);
                }else{
                    min3 = min2 - min1+(hour2-hour1)*60 ;
                    System.out.printf("%dm",min3);
                }
            }

        }
    }
}
