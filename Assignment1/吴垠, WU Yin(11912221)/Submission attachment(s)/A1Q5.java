import java.util.Scanner;
public class A1Q5 {
    public static void main(String[] args) {
        int length = args.length;

        int i = 0;
        while (i < length) {
            String prize = args[i].toString();
            String[] arr = prize.split("[.]");
            int temp = (int)Double.parseDouble(args[i]);
            int a = Integer.parseInt(arr[0]);
            int unit = a % 10;
            if (unit == 2) {
                System.out.printf("%.1f ",Double.parseDouble(args[i]) - 2 + 6);
            } else if (unit == 4) {
                System.out.printf("%.1f",Double.parseDouble(args[i]) - 4 + 9);
            }
            i++;

        }
//in the situation of running code in IDEA , if you did not sent parameter ,the code would not operate.
    }
}