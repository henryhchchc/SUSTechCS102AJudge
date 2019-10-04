public class A1Q4 {
    public static void main(String[] args) {
        int[] A = new int[args.length];
        int s = 0;
        int max = 0;
        for (int i = 0; i < args.length; i++) {
            A[i] = Integer.parseInt(args[i]);
            s = s + A[i];
            if (A[i] >= max) {
                max = A[i];
            }
        }
        if (A.length >= 10 && s >= 5000 || max >= 8000) {
            System.out.print("Diamond");
        } else if (A.length >= 5 && s >= 2000 || max >= 5000) {
            System.out.print("Gold");
        } else if (A.length >= 2 && s >= 800 || max >= 1000) {
            System.out.print("Silver");
        }
    }
}



