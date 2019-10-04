public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int i = 0;
        double sum = 0;
        double max = Integer.parseInt(args[0]);
        while (i < length) {
            sum += Integer.parseInt(args[i]);
            if (max >= Integer.parseInt(args[i])) {
                max = max;
            } else {
                max = Integer.parseInt(args[i]);
            }
            ++i;
        }
        if (length >= 10 & sum >= 5000 || max >= 8000) {
            System.out.println("Diamond");
        } else if (length >= 5 & sum >= 2000 || max >= 3000) {
            System.out.println("Gold");
        } else if (length >= 2 & sum >= 800 || max >= 1000) {
            System.out.println("Silver");
        } else {
            System.out.println("You are not rich enough.");
        }
    }
}
