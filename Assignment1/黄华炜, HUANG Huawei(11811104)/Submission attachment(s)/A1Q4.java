//package Assignment;

public class A1Q4 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        int Max = 0;
        for (int i = 0; i < args.length; i++) {
            int money = Integer.parseInt(args[i]);
            if (money >= 8000) {
                Max = 3;
            } else if (money >= 3000) {
                Max = 2;
            } else if (money >= 1000) {
                Max = 1;
            }
        }
        if (args.length >= 10 && sum >= 5000) {
            System.out.println("Diamond");
        } else if (args.length >= 10 && Max == 3) {
            System.out.println("Diamond");
        } else if (args.length >= 10 && Max == 2) {
            System.out.println("Gold");
        } else if (args.length >= 10 && Max == 1) {
            System.out.println("Silver");
        } else if (args.length >= 5 && sum >= 2000) {
            System.out.println("Gold");
        } else if (args.length >= 5 && Max >= 2) {
            System.out.println("Gold");
        } else if (args.length >= 5 && Max == 1) {
            System.out.println("Silver");
        } else if (args.length >= 2 && sum >= 800) {
            System.out.println("Silver");
        } else if (args.length >= 2 && Max >= 1) {
            System.out.println("Silver");
        }


    }
}


