public class A1Q4 {
    public static void main(String[] args) {
        double max = 0;
        int i = args.length;
        int number = 1;
        int price = Integer.parseInt(args[number]);
        int sum = 0;
        while (number <=i) {
            if (max < price) {
                max = price;
                number++;
                sum += price;
            } else {
                number++;
                sum += price;
            }
        }
        if (sum >= 5000 && i >= 10 || max >= 8000) {
            System.out.println("Diamond");
        } else if (sum >= 2000 && i >= 5 || max >= 3000) {
            System.out.println("Gold");
        } else if (sum >= 800 && i >= 2 || max >= 1000) {
            System.out.println("Silver");
        }
    }
}
