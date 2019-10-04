public class A1Q4 {
    public static void main(String[] args) {
        double sum = 0;
        double max = 0;
        for (int i = 0; i < args.length; i++) {
            double price = Double.parseDouble(args[i]);
            if (price >= max) {
                max = price;
            }
            sum = sum + price;
        }

        if (args.length >= 10 && sum >= 5000 || max >= 8000) {
            System.out.println("Diamond");
        }
        else if(args.length >= 5 && sum >= 2000 || max >= 3000){
            System.out.println("Gold");
        }
        else if(args.length >= 2 && sum >= 800 || max >= 1000){
            System.out.println("Silver");
        }
    }
    }
