public class A1Q4 {
    public static void main(String[] args){

        int length = args.length;
        int sum = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        while (a < length) {
            int price = Integer.parseInt(args[a]);
            sum += price;
            a ++;
            if (price >= 8000)
                b = price;
            else if (price >= 3000)
                c = price;
            else if (price >= 1000)
                d = price;
        }

            if (length >= 10 && sum >= 5000 || b != 0 )
                System.out.printf("Diamond");
            else if (length >= 5 && sum >= 2000 || c != 0)
                System.out.printf("Gold");
            else if (length >= 2 && sum >= 800 || d != 0)
                System.out.printf("Silver");
    }
}
