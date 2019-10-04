import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int hour1 = input.nextInt();
        int minute1 = input.nextInt();
        int second1 = input.nextInt();
        int hour2 = input.nextInt();
        int minute2 = input.nextInt();
        int second2 = input.nextInt();

        int T1 = hour1*3600 + minute1*60 + second1;
                int T2 = hour2*3600 + minute2*60 + second2;
                        int T = T2 - T1;

        int second = T%60;
        int min = T/60;

        if(T == 0){
            System.out.print("0s");
        }else if(min==0){
            System.out.printf("%ss",second);
        }else if(second==0){
            System.out.printf("%sm",min);
        }else
            System.out.printf("%sm%ss",min,second);
    }
}