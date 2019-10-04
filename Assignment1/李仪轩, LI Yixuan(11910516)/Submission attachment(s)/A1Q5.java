public class A1Q5 {
    public static void main(String[] args) {
        int number = args.length;
        double[] treat = new double[number];
        for (int i = 0; i < number; i++) {
            treat[i] = Double.parseDouble(args[i]);
            double divide = treat[i] % 10;
            if (divide >= 2 && divide < 3) {
                treat[i] += 4;
                System.out.print(treat[i]+" ");
            }
            else if (divide >= 4 && divide < 5) {
                treat[i] += 5;
                System.out.print(treat[i]+" ");
            }
        }
    }
}