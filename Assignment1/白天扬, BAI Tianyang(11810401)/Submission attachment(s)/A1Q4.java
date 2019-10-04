public class A1Q4 {
    public static void main(String[] args){
        int n=0;
        int total=0;
        int length = args.length;
        while (n < length) {
            String A=args[n];
            int S=Integer.parseInt(A);
            total += S;
            n++;
        }
        if ((length >= 10 && total >= 5000)||total >= 8000){
            System.out.println("Diamond");
        }
        else if ((length >= 5 && total >= 2000)||total >= 3000){
            System.out.println("Gold");
        }
        else if ((length >= 2 && total >= 800)||total >= 1000){
            System.out.println("Silver");
        }

    }
}