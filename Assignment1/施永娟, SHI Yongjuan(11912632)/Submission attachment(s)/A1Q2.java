import java.util.Scanner;

    public class A1Q2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int x, y, z, a, b, c;
            x = input.nextInt();
            y = input.nextInt();
            z = input.nextInt();
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            int m = 3600 * (a - x) + 60 * (b - y) + (c - z);
            int n = m / 60, q = m % 60;
            if (a - x >= 0) {
                if (n != 0 && q != 0) {
                    System.out.printf("%dm%ds", n, q);
                } else if(n!=0&&q==0){
                    System.out.printf("%dm", n);
                } else if(n==0&&q!=0){
                    System.out.printf("%ds", q);
                } else if(n==0&&q==0){
                    System.out.println("0s");
                }
            }

        }
    }


