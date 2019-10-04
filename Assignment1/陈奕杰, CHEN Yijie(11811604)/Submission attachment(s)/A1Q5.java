public class A1Q5 {
    public static void main (String[] args) {

        int length = args.length;
        double price = 0.0;
        double trueOfPrice = 0.0;
        for (int i = 0; i < length; i ++){
            price = Double.parseDouble(args[i]);
            int intOfPrice = (int)price;
            int rest = intOfPrice%10;
            if (rest==2){
                trueOfPrice = price+4;
                System.out.printf("%.1f ",trueOfPrice);
            }
            else if (rest==4){
                trueOfPrice = price+5;
                System.out.printf("%.1f ",trueOfPrice);
            }
        }
    }
}
