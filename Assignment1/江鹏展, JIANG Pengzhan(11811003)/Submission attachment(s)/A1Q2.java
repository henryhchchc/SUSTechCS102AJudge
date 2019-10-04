import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        int hours,minutes,second,hour1,minute1,second1,second2,second3,second4,minute2,second5;
        Scanner input = new Scanner(System.in);
        hour1= input.nextInt();
        minute1= input.nextInt();
        second1= input.nextInt();
        second2= hour1*3600 + minute1*60 + second1;
        hours = input.nextInt();
        minutes = input.nextInt();
        second = input.nextInt();
        second3 = hours*3600 + minutes*60 + second;
        second4 = second3-second2;
        minute2 = second4/60;
        second5 = second4%60;
        if(second5==0&&minute2==0){
            System.out.printf("0s");
        }
        else if (second5==0){
            System.out.printf("%dm",minute2);
        }
        else if(minute2==0){
            System.out.printf("%ds",second5);
        }
        else {
            System.out.printf("%dm%ds",minute2,second5);
        }
    }
}
