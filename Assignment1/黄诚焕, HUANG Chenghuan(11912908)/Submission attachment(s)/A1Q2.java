import  java.util.Scanner;
public class A1Q2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int hour = d-a;
        int minute = e-b;
        int second = f-c;
        int minute1=hour*60+minute;
        if (second<0) {
            second+=60;
            minute1--;}
        if(minute1 == 0){
            System.out.println(second+"s");
        }else if(second == 0){
            System.out.println(minute1+"m");
        }else System.out.printf("%dm%ds\n",minute1,second);
    }
}