public class A1Q5 {
    public static void main(String[] args) {
        int length = args.length;
        for (int i = 0; i < length; i++) {
            double price = Double.parseDouble(args[i]);
            int a = (int) price;
            if (a % 10 == 2) {
                System.out.println(price + 4);
            } else if (a % 10 == 4)
                System.out.println(price + 5);

        }

    }
}
