public class A1Q5 {
    public static void main(String[] args) {
        int n = 0;
        int length = args.length;
        while (n < length) {
            String A = args[n];
            double S = Double.parseDouble(A);
            if((int)S % 10 == 2){
                S += 4;
                System.out.print(S);
                System.out.print(" ");
            }
            else if ((int)S % 10 == 4){
                S += 5;
                System.out.print(S);
                System.out.print(" ");
            }
            n++;
        }
    }
}