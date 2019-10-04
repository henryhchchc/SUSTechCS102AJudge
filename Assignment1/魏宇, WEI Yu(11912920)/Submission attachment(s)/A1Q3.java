import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner badguy = new Scanner(System.in);
        double sum = 0;
        while (badguy.hasNext()) {
            double price = badguy.nextDouble();
            double quota = badguy.nextDouble();
            if (quota != Math.floor(quota)) {
                sum = sum + Math.floor(quota)*price+Math.round(5*price)/10+ 1;
            } else {
                sum = sum + price * quota;
            }
        }
        System.out.printf("%.1f",sum);
    }
}