import java.util.Scanner;


public class A1Q2 {
    public static void main(String[] args) {
        int a = 6;
        int[] time = new int[a];
        Scanner input = new Scanner(System.in);

        while (a != 0) {
            time[6 - a] = input.nextInt();
            a--;
        }

        int min = (time[3] - time[0]) * 60 + (time[4] - time[1]);
        int sec = (time[5] - time[2]);

        if (sec < 0) {
            min = min - 1;
            sec = 60 + sec;

            if (min != 0)
                System.out.printf("%dm%ds", min, sec);
            else if (min == 0)
                System.out.printf("%ds", sec);
            else if (sec == 0)
                System.out.printf("%dm", min);
        } else {
            if ((min != 0) && (sec != 0))
                System.out.printf("%dm%ds", min, sec);
            else if (min == 0)
                System.out.printf("%ds", sec);
            else if (sec == 0)
                System.out.printf("%dm", min);
        }

    }


}


