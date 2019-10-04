import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();
        int number6 = input.nextInt();
        if (number6 <= number3) {
            if (number6 == number3) {
                int second = 0;
                int minute = (number4 - number1) * 60 + number5 - number2 - 1;
                if (minute == 0) {
                    System.out.println("0s");
                } else {
                    System.out.println(minute + "m");
                }
            } else {
                int second = number6 + 60 - number3;
                int minute = (number4 - number1) * 60 + number5 - number2 - 1;
                if (minute == 0) {
                    System.out.println(second + "s");
                } else {
                    System.out.println(minute + "m" + second + "s");
                }
            }
        } else {
            int second = number6 - number3;
            int minute = (number4 - number1) * 60 + number5 - number2;
            if (minute == 0) {
                System.out.println(second + "s");
            } else {
                System.out.println(minute + "m" + second + "s");
            }
        }
    }
}


