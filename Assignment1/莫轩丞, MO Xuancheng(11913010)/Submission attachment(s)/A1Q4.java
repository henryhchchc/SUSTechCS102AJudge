public class A1Q4 {
    public static void main(String[] args) {
        double sum = 0, amount = 0;
        int times;
        int number = args.length;

        for (times = 0; times < number; times++) {
            double price = Double.parseDouble(args[times]);
            sum += price;
            System.out.println();
            if (amount < price) {
                amount = price;
            }
        }
            if (times >= 10 && sum >= 5000 || amount >= 8000) {
                System.out.println("Diamond");
            } else if (times >= 5 && times < 10 && sum >= 2000 && sum < 5000 || amount >= 3000 && amount < 8000) {
                System.out.println("Gold");
            } else if (times >= 2 && times < 5 && sum >= 800 && sum < 2000 || amount >= 1000 && amount < 3000) {
                System.out.println("Silver"); 
            }
    }
}