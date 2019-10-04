import java.util.Scanner;
public class A1Q4 {
    public static void main(String[] args) {
        String degree="";
        int times = 0;
        int total = 0;
        Scanner input = new Scanner(System.in);
        int length=args.length;
        int i=0;
        while (i<length) {
            String money1= args[i];
            int money=Integer.parseInt(money1);
            if (money >= 1000) {
                degree = "Silver";
            }
            if (times >= 2 && total >= 800) {
                degree = "Silver";
            }
            if (money >= 3000) {
                degree = "Gold";
            }
            if (total >= 2000 && times >= 5) {
                degree = "Gold";
            }

            if (money >= 8000) {
                degree = "Diamond";
            }
            if (total >= 5000 && times >= 10) {
                degree = "Diamond";
            }
            total = total + money;
            times++;
            i++;
        }
        System.out.printf("%s",degree);

    }
}