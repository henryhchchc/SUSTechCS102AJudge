public class A1Q1 {
        public static void main(String[] args) {
            int number = Integer.parseInt(args[1]);
            String name = args[0];
            if (number <= 11919999 && number >= 11510000) {
                System.out.printf("%s ,welcome to SUSTECH Hot Pot Restaurant!", name);
            } else {
                System.out.printf("%d",number);
            }
        }
    }
