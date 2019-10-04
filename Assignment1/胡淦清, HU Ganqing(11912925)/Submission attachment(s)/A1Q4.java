import java.util.Scanner;

public class A1Q4 {

    public static void main(String[] args) {
        //vip system
        Scanner in=new Scanner(System.in);
        int money =Integer.parseInt(args[0]);
        int total = 0;
        int times = 0;
        while (in.hasNext()) {
            total += money;
            times++;
            money = Integer.parseInt(args[0]);
        }
        if (money >= 8000 || total >= 5000&&times >= 10) {
            System.out.println("Diamond");
        }
        if (money >= 3000 || total >= 2000&&times >=5) {
            System.out.println("Gold");
        }
        if (money >= 1000 || total >= 800&&times >=2) {
            System.out.println("Silver");
        }
    }
}