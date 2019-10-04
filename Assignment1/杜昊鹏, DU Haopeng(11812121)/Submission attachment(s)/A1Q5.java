public class A1Q5 {

    public static void main(String[] args) {
        float m = 0;
        float n = 0;
        float a = 0;
        float b = 0;

        for ( int i = 0; i<args.length ; i++){
            a = Float.parseFloat(args[i]) / 10;
            m = Float.parseFloat(args[i]) % 10;
            n = m / 1;
            b = m % 1;
            int c = (int)a;
            int d = (int)n;

            if (d == 2)
                System.out.println(c * 10 + 6 + b+" ");
            else if (d == 4)
                System.out.println(c * 10 + 9 + b+" ");
        }

    }
}

