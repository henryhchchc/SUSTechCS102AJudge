import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        do {
            double dish = sc.nextDouble();
            double number = sc.nextDouble();
            if ( number == (int) number ) {
                total += Math.round(dish*number*10)/10.0;
            }
            else {
                total += Math.round((dish/2 + 1)*10)/10.0 + Math.round(dish*(number-0.5)*10)/10.0;
            }
        } while (sc.hasNext());
        System.out.printf("%.1f",total);
    }
}