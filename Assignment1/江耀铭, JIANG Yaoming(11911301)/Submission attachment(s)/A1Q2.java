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
        int number7 = (number4 - number1) * 60 + (number5 - number2);
        int number8 = number6 - number3;

        if (number8 < 0)
            number8 += 60;
        number7 -= 1;
        if ((number7 != 0) && (number8 == 0))
        System.out.printf("%dm", number7);
        else if ((number7 == 0) && (number8 != 0))
        System.out.printf("%ds", number8);
        else if ((number7 == 0) && (number8 == 0))
        System.out.println("0s");
        else if ((number7 != 0) && (number8 != 0))
        System.out.printf("%dm%ds", number7, number8);
    }
}