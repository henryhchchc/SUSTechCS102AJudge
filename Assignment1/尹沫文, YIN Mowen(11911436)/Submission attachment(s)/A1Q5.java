import com.sun.deploy.security.SelectableSecurityManager;

public class A1Q5 {
    public static void main(String[] args) {
        for (String str : args) {
            double price = Double.parseDouble(str);
            double a = price / 10;
            double b = (a - Math.floor(a)) * 10;
            double x = b - Math.floor(b);
            double g = b - x;
            double s = price - b;

            if (g == 2) {
                g = 6;
                price = s + g + x;
                System.out.printf("%.1f ", price);
            } else if (g == 4) {
                g = 9;
                price = s + g + x;
                System.out.printf("%.1f ", price);
            } else
                System.out.printf("");
        }
    }
}
