import com.sun.deploy.security.SelectableSecurityManager;

public class A1Q4 {
    public static void main(String[] args) {
        String m = args[0];
        int max = Integer.valueOf(m);
        int length = args.length;
        int sum = 0;
        int x;
        for (x = 0; x < length; x++) {
            int i = Integer.valueOf(args[x]);
            sum = sum + i;
            if (i > max) {
                max = i;
            }
        }
        {
            if (max >= 8000) {
                System.out.println("Diamond");
            } else if (length > 9 && sum >= 5000) {
                System.out.println("Diamond");
            } else if (max >= 3000) {
                System.out.println("Gold");
            } else if (length > 4 && sum >= 2000) {
                System.out.println("Gold");
            } else if (max >= 1000) {
                System.out.println("Silver");
            } else if (length > 1 && sum >= 800) {
                System.out.println("Silver");
            } else System.out.println();


        }
    }
}
