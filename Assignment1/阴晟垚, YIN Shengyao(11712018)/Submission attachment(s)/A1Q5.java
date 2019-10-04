public class A1Q5 {
    public static void main(String[] args) {
        Double single, a, remainder, b, correct;
        int i;
        int length = args.length;
        for (i = 0; i < length; i++) {
            single = Double.parseDouble(args[i]);
            a = Math.floor(single);
            remainder = a % 10;
            b = single - remainder;
            if (remainder == 2) {
                remainder = 6.0;
                correct = b + remainder;
                System.out.print(correct + " ");

            }
            if (remainder == 4) {
                remainder = 9.0;
                correct = b + remainder;
                System.out.print(correct + " ");

            }


        }


    }
}
