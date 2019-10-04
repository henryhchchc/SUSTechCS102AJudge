import java.util.Scanner;


public class A1Q2 {
    public static void main(String[] args){
        int time[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<6; i++){
            time[i] = sc.nextInt();
        }
        int sum1, sum2 ;
        sum1 = time[0]*3600+time[1]*60 + time[2];
        sum2 = time[3]*3600+time[4]*60 + time[5];
        sum1 = sum2 -sum1;
        int min, second;
        min = sum1 / 60;
        second = sum1 % 60;
        System.out.printf("%dm%ds",min,second);



    }


}
