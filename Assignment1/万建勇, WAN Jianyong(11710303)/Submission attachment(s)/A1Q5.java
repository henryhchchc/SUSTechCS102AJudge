

public class A1Q5{
    public static void main(String[] args) {
        int length = args.length;
        for (int i = 0; i < length; i++) {
            double price = Double.parseDouble(args[i]);
            int n = (int) price;
            int num = n % 10;
            if (num == 2)
                System.out.println(price + 4);
            else if (num == 4)
                System.out.println(price + 5);
            continue;

        }
    }
}

