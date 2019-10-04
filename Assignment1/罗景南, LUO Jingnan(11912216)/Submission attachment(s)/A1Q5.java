
public class A1Q5 {
    public static void main(String[]args) {
        int length = args.length;

        double[] arr = new double[length];


        for (int i = 0; i < args.length; i++) {
            arr[i] =Double.parseDouble(args[i]);
            if ((Math.floor(arr[i])) % 10 == 2) {
                arr[i] += 4;
                double X = arr[i];
                System.out.printf("%.1f", X);
            }
            if ((Math.floor(arr[i])) % 10 == 4) {
                arr[i] += 5;
                double Y = arr[i];
                System.out.printf(" %.1f", Y); }

            }
        }
    }



