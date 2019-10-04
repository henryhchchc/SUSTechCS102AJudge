public class A1Q4 {
    public static void main(String[] args) {
        int gradecounter=args.length;
        double t = 0;
        double max = 0;
        int i=0;
        while (i<gradecounter) {
            double d=Double.parseDouble(args[i]);
            t += t + d;
            if (max <= d) {
                max = d;
            }++i;
        }
        if ((t >= 5000 & gradecounter >= 10) || max >= 8000) {
            System.out.print("Diamond");

        } else if ((t >= 2000 & gradecounter >= 5) || max >= 3000) {
            System.out.print("Gold");

        } else if ((t >= 800 & gradecounter >= 2) || max >= 1000) {

            System.out.print("Silver");

        }

    }
}
