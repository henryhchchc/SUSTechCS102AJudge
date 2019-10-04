public class A1Q5 {

    public static void main(String[] args) {

        int l = args.length;
        float num;

        for (int i = 0; i < l; i++) {

            num = Float.parseFloat(args[i]);

            if (((int) num) % 10 == 2) {

                num = num + 4;

                System.out.printf("%.1f ", num);

            } else if (((int) num) % 10 == 4) {

                num = num + 5;

                System.out.printf("%.1f ", num);

            }else{
                continue;
            }
        }
    }
}