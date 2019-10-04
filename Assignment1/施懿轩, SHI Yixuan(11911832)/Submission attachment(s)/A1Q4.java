

public class A1Q4 {

    public static void main(String[] args) {
        int length = args.length;
        int[] i = new int[length];
        int total = 0;
        int max = 0;
        for (int a = 1; a <= length; a++) {
            int money = Integer.parseInt(args[a-1]);
            total = total + money;
            if (money > max) {
                max = money;
            }

        }
        if ((length >= 10 && total >= 5000) || max >= 8000) {
            System.out.println("Diamond");
        } else if ((length >= 5 && total >= 2000) || max >= 3000) {
            System.out.println("Gold");
        } else if ((length >= 2 && total >= 800) || max >= 1000) {
            System.out.println("Silver");
        }
    }
}