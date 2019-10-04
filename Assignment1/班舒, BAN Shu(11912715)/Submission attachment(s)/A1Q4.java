import java.util.Scanner;

public class A1Q4 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int count = 0;
            int sum = 0;
            int max = 0;
            while (in.hasNext()) {
                int price = in.nextInt();
                max = price;
                if (max < price) {
                    max = price;
                } else {
                    max = max;
                }
                count++;
                sum += price;
            }
            if (count >= 10 && sum >= 5000 || max >= 8000) {
                System.out.println("Diamond");
            } else if (count >= 5 && sum >= 2000 || max >= 3000) {
                System.out.println("Gold");
            } else if (count >= 2 && sum >= 800 || max >= 1000) {
                System.out.println("Sliver");
            } else System.out.println("");
        }
    }

