public class A1Q4 {
        public static void main(String[] args) {
            double total;
            total = 0;
            int diamond = 0;
            int gold = 0;
            int silver = 0;
            for (String arg : args) {
                double a = Double.parseDouble(arg);
                total += a;
                if (a >= 8000)
                    diamond++;
                if (a < 8000 && a >= 3000)
                    gold++;
                if (a < 3000 && a>= 1000)
                    silver++;
            }
             int b=args.length;
            if ((b >= 10 && total >= 5000) || diamond >= 1) {
                System.out.println("Diamond");
            } else if ((b >= 5 && total >= 2000) || gold >= 1) {
                System.out.println("Gold");
            } else if ((b >= 2 && total >= 800) || silver >= 1) {
                System.out.println("Silver");
            }}}

