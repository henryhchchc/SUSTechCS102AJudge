

public class A1Q5 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            double price = Double.parseDouble(args[i]);
            double a = price%1;
            double b = price-a;
            if (b%10==2){
                System.out.print(price+4+" ");
            }else if (b%10==4){
                System.out.print(price+5+" ");
            }else {
            }
        }
    }
}
