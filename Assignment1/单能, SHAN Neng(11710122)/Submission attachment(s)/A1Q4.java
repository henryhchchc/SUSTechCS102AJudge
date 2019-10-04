public class A1Q4 {
    public static void main(String[] args){
        double[] amount = new double[args.length];
        double sum = 0;
        double big = 0;

        for (int i = 0; i < args.length; i++) {
            amount[i] = Double.parseDouble(args[i]);
            sum += amount[i];
            big = amount[0];
            if (big < amount[i])
                big = amount[i];
        }

            if (big >= 8000 || args.length >= 10 && sum >= 5000)
                System.out.println("Diamond");
            else if (big >= 3000 || args.length >= 5 && sum >= 2000)
                System.out.println("Gold");
            else if (big >= 1000 || args.length >= 2 && sum >= 800)
                System.out.println("Silver");

    }
}
