//package Assignment;


public class A1Q5 {
    public static void main(String[] args) {

        int n = args.length;

        for (int i = 0; i < n; i++) {

            double number = Double.parseDouble(args[i]);

            if ((int) number % 10 == 2) {
                number += 4;
                System.out.print(number + " ");
            }
            if ((int) number % 10 == 4) {
                number += 5;
                System.out.print(number + " ");
            } else if ((int) number % 10 != 2 && (int) number % 10 != 4)
                continue;

        }
    }
}


