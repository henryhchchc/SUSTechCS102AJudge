public class A1Q5 {
    public static void main(String[] args) {
        double s;
        int g ;
        for (int i = 0; i < args.length; i++) {
            double age = Double.parseDouble(args[i]);
            g = (int) (age % 10);
            if (g == 2){
                s = age - g + 6;
            System.out.printf("%.1f ", s);
        }else
            if (g == 4){
                s = age - g + 9;
                System.out.printf("%.1f ", s);
            }else
                System.out.print("");
        }
    }
}