public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int sum = 0;
        int n = 1;
        int max = -1;
        for (int i = 0; i < args.length; i++) {
            length = Integer.parseInt(args[i]);
            if (max < length) {
                max = length;
            } else sum = sum + length;
            n++;
        }
        if (max >= 8000) {
            System.out.printf("Diamond");
        } else if (max >= 3000) {
            System.out.printf("Gold");
        } else if (max >= 1000) {
            System.out.printf("Silver");
        } else {
            n = n + 1;
            sum = sum + max;
            if (n >= 10 && sum >= 5000) {
                System.out.printf("Diamond");
            } else if (n >= 5 && sum >= 2000) {
                System.out.printf("Gold");
            } else if (n >= 2 && sum >= 800) {
                System.out.printf("Silver");
            }

        }
    }
}