public class A1Q5 {
    public static void main(String[] args){
        double[] price = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            price[i] = Double.parseDouble(args[i]);
            String s = String.format("%.1f", price[i]);
            price[i] = Double.parseDouble(s);
            if ((int)price[i] %10 == 2)
                price[i] += 4;
            else if ((int)price[i] %10 == 4)
                price[i] += 5;
            else
                continue;
            System.out.print(price[i] + " " );
        }

    }
}
