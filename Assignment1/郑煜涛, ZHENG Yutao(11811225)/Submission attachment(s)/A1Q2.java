import java.util.Scanner;
public class A1Q2 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int hour1,hour2,minute1,minute2,minute3,second1,second2,second3,time1,time2,time3;
        hour1 = input.nextInt();
        minute1 = input.nextInt();
        second1 = input.nextInt();
        hour2 = input.nextInt();
        minute2 = input.nextInt();
        second2= input.nextInt();
        time1 = 3600*hour1+60*minute1+second1;
        time2 = 3600*hour2+60*minute2+second2;
        time3 = time2-time1;
        minute3 = time3/60;
        second3 = time3-minute3*60;
        if(minute3==0) {
            System.out.println(second3 + "s");
        }else
             System.out.println(minute3+"m"+second3+"s");

   }

}
