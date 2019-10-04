public class A1Q4 {
    public static void main(String[] args) {

        int length = args.length;

        int n = 0;
        int sum = 0;

        int[] c = new int[length];

        while (n < length) {
            c[n] = Integer.parseInt(args[n]);
            sum += c[n];
            n++;
        }

        int max = c[0];

        for (int counter = 1; counter < length; counter++) {
            if (c[counter - 1] >= c[counter]) {

            } else max = c[counter];
        }

        if ((length >= 10 && sum >= 5000) || max >= 8000) {
            System.out.println("Diamond");
        }
        else
            if ((length >= 5 && sum >= 2000) || max >= 3000) {
            System.out.println("Gold");
            }
            else
                if ((length >= 2 && sum >= 800) || max >= 1000) {
                    System.out.println("Silver");
                    }
    }
}


