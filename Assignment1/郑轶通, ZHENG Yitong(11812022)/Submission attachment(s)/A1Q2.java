import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = (d - a) * 3600 + (e - b) * 60 + (f - c);
        int minutes = g / 60;
        int seconds = g % 60;

        if (minutes == 0 && seconds == 0) {
            System.out.println("0s");
            return;
        }

        if (seconds == 0){
            System.out.printf(minutes + "m");
        }
        else System.out.println(minutes + "m" + seconds + "s");
    }
}
