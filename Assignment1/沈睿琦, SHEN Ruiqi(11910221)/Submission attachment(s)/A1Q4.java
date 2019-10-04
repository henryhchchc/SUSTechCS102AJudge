public class A1Q4 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        int max = 0;
        for (int b = 1; n <= (args.length)-1; ) {
           int a = Integer.parseInt(args[n]);
            sum += a;
            ++n;
            if (a >= max) {
                max = a;
            }
        }
        if (max >= 8000 |( sum >= 5000 & n >= 10)) {
            System.out.println("Diamond");
        } else if (max >= 3000 |( sum >= 2000 & n >= 5)) {
            System.out.println("Gold");
        } else if (max >= 1000 |(sum >= 800 & n >= 2)) {
            System.out.println("Silver");
        }
    }
}