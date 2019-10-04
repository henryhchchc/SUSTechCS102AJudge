import  java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();
        int H = scan.nextInt();
        int M = scan.nextInt();
        int S = scan.nextInt();
        int hour=H-h;
        int min=M-m;
        int sec=S-s;
        int Time=hour*3600+min*60+sec;
        if(h>=24||m>=60||s>=60){
            System.out.printf("Input error.Please retype.");
        }else if(H>=24||M>=60||S>=60){
            System.out.printf("Input error.Please retype.");
        }else if(Time<0){
            System.out.printf("Input error.Please retype.");
        }else if(Time>=0&Time<60){
            System.out.printf(Time+"s");
        }else if(Time%60==0&Time>=60){
            System.out.printf(Time/60+"m");
        }else{
            System.out.printf(Time/60+"m"+Time%60+"s");
        }
    }
}