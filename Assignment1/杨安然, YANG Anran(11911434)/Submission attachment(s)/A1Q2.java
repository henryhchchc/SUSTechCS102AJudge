import java.util.Scanner;
public class A1Q2 {
    public static void main(String []args){

        int wait1=0;
        int wait2=0;

        Scanner input=new Scanner(System.in);

        int hour1=input.nextInt();
        int minute1=input.nextInt();
        int second1=input.nextInt();
        int hour2=input.nextInt();
        int minute2=input.nextInt();
        int second2=input.nextInt();

        if(minute2>=minute1&&second2>=second1)
            wait1=(hour2-hour1)*60+minute2-minute1;
        else if(minute2>=minute1&&second2<second1)
            wait1=(hour2-hour1)*60+minute2-minute1-1;
        else if(minute2<minute1&&second2>=second1)
            wait1=(hour2-hour1)*60-minute1+minute2;
        else if(minute2<minute1&&second2<second1)
            wait1=(hour2-hour1-1)*60+59-(minute1-minute2);
        else if(minute1==minute2)
            wait1=(hour2-hour1)*60;

        if(second2>second1)
            wait2=second2-second1;
        else if(second1>second2)
            wait2=60-second1+second2;
        else if(second1==second2)
            wait2=0;

        if(wait1!=0&&wait2!=0)
            System.out.printf("%dm%ds",wait1,wait2);
        else if(wait1!=0&&wait2==0)
            System.out.printf("%dm",wait1);
        else if(wait1==0)
            System.out.printf("%ds",wait2);

    }
}
