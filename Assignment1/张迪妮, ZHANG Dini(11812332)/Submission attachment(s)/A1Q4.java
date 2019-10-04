import java.util.ArrayList;
import java.util.Scanner;

public class A1Q4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int total = 0;
        int max = 0;
        String grade = "";

        while (in.hasNextInt()) {
            int number  = in.nextInt();
            if (number > max) {
                max = number;
            }
            total += number;
            list.add(in.nextInt());
        }
        if (list.size() >= 10) {
            if (max >= 8000 || total >= 5000) {
                grade = "Diamond";
            }
        } else if (list.size() >= 5) {
            if (max >= 3000 || total >= 2000) {
                grade = "Gold";
            }
        } else if (list.size() >= 2) {
            if (max >= 1000 || total >= 800) {
                grade = "Diamond";
            }
        }
        System.out.println(grade);

    }
}
