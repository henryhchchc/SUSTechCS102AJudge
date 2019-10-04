import javax.swing.*;

public class A1Q4 {

    public static void main(String[] args) {
        double sum = 0;
        double max = 0;
        max = Double.parseDouble(args[0]);
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
            if (Double.parseDouble(args[i]) > max) {
                max = Double.parseDouble(args[i]);
            }
        }
        if (max >= 8000 || args.length >= 10 && sum >= 5000) {
            System.out.println("Diamond");
        } else if (max >= 3000 || args.length >= 5 && sum >= 2000) {
            System.out.println("Gold");
        } else if (max >= 1000 || args.length >= 2 && sum >= 800) {
            System.out.println("Silver");
        }
    }

}



