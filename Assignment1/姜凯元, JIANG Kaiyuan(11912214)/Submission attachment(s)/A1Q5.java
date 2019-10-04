import java.io.PrintStream;

public class A1Q5 {
    public static void main(String[] args) {

        for (int m = 0; m < args.length; m++) {
            double price = Float.parseFloat(args[m]);
            double PRICE = price / 10;
            double p = Math.floor(price);
            double pp = Math.floor(PRICE);
            double ppp = pp * 10;
            double pppp = Math.floor(price - ppp);
            double pNEW=0;
            double pNEWE=0;
            if (args[m].length() == 2) {
                if (p == 2)
                    pNEW = price + 4.0;
                    System.out.printf("%.1f", pNEW);
                if (p == 4)
                    pNEWE = price + 5.0;
                    System.out.printf("%.1f",pNEWE);
            }
            else if (pppp == 2) {
                    pNEW = price + 4.0;
                    System.out.printf("%.1f ", pNEW);
            } else if (pppp == 4) {
                    pNEWE = price + 5.0;
                    System.out.printf("%.1f ", pNEWE);
            } else
                ;
            }
        }
    }
