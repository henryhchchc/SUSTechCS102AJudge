
public class A1Q4 {
    public static void main(String[] args) {
        int n = 0;
        int total = 0;
        int max = 0;

        while(n<args.length) {
            int cost = Integer.parseInt(args[n]);
            total += cost;
            if (max < cost) {
                max = cost;
            }
            ++n;
        }

        if (max < 8000 && !(n >= 10 & total >= 5000)) {
            if (max < 3000 && !(n >= 5 & total >= 2000)) {
                if (max >= 1000 || n >= 2 & total >= 800) {
                    System.out.println("Silver");
                }
            } else {
                System.out.println("Gold");
            }
        } else {
            System.out.println("Diamond");
        }

    }
}
