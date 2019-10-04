import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int hour1=scan.nextInt();
        int min1=scan.nextInt();
        int sec1=scan.nextInt();
        int hour2=scan.nextInt();
        int min2=scan.nextInt();
        int sec2=scan.nextInt();
        int min=(hour2-hour1)*60+(min2-min1);
        int sec=sec2-sec1;
        if(min==0){
            System.out.print(sec+"s");
        }
        if(min>0&&sec>0){
            System.out.print(min+"m"+sec+"s");
        }
        if(min>0&&sec==0){
            System.out.print(min+"m");
        }
        if(min>1&&sec<0){
            min--;
            sec=sec+=60;
            System.out.print(min+"m"+sec+"s");
        }
        if (min==1&&sec<0){
            sec=sec+=60;
            System.out.print(sec+"s");
        }






    }

}
