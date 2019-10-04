import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int hour1,minute1,second1,hour2,minute2,second2,minute,second;
        hour1 = input.nextInt();
        minute1 = input.nextInt();
        second1 = input.nextInt();
        hour2 = input.nextInt();
        minute2 = input.nextInt();
        second2 = input.nextInt();
        if (second2<second1){
            second=60+second2-second1;
            minute2=minute2-1;
        }else{
            second=second2-second1;}
        minute=60*(hour2-hour1)+minute2-minute1;
        if (second==0&&minute==0){
            System.out.printf("0s");
        }else if(second==0&&minute!=0){
            System.out.printf("%dm",minute);
        }else if(second!=0&&minute==0){
            System.out.printf("%ds",second);
        }else if(second!=0&&minute!=0){
            System.out.printf("%dm %ds",minute,second);
        }
    }
}
