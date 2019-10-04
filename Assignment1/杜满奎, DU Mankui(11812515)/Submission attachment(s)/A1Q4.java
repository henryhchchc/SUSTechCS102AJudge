import java.util.Scanner;

public class A1Q4 {
    public static void main(String[] args) {
        int counter = 0;
        int total = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            int amount;
            amount = input.nextInt();
            total = total + amount;
            counter = counter + 1;
            if(amount >= 8000) {
                a = a + 1;
            }
            else if(amount >= 3000) {
                b = b + 1;
            }
            else if(amount >=1000) {
                c = c + 1;
            }
        }
        if(a >= 1 || (counter >= 10 && total >= 5000)) {
            System.out.println("Diamond");
        }
        else if(b >= 1 || (counter >= 5 && total >= 2000)) {
            System.out.println("Gold");
        }
        else if(c >= 1 || ((counter >= 2) && (total >= 800))) {
            System.out.println("Silver");
        }
    }
}
