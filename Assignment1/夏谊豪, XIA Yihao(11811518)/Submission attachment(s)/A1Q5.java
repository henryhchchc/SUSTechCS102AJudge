public class A1Q5 {
    public static void main(String[] args) {
        double singleFigure;
        int length = args.length;
        int i;
        for (i = 0; i < length; i++) {
            double x = Double.valueOf(args[i]);
            singleFigure = x % 10;
            if (singleFigure >= 2 && singleFigure < 3) {
                double newx = x + 4;
                System.out.print(newx + " ");
            } else if (singleFigure >= 4 && singleFigure < 5) {
                double newx = x + 5;
                System.out.print(newx);
            } else {
                double newx = x;


            }
        }
    }

}
