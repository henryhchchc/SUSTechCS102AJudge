public class A1Q4 {
    public static void main(String[] args) {
        int n = args.length;
        int a = 0;
        int[] index = new int[n];
        for (n = 0; n < args.length; n++) {
            a += Integer.parseInt(args[n]);
            index[n] = Integer.parseInt(args[n]);
        }
        int max = 0;
        for (int i = 0; i <= n-1; i++) {
            if (n >= 2&&i>=1) {
                max = Math.max(index[i], index[i - 1]);
            }else if (i==0){
                max=index[i];
            }
        }
            if ((n >= 10 && a >= 5000) || max > 8000) {
                System.out.println("Diamond");
            } else if ((n >= 5 && a >= 2000) || max > 3000) {
                System.out.println("Gold");
            } else if ((n >= 2 && a >= 800) || max > 1000) {
                System.out.println("Silver");
            } else {
                System.out.println("Sorry, you are not VIP");
            }
        }
    }