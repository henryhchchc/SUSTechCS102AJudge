public class A1Q1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[1]);
        int b=a;
        int count = 0;
        while (a >= 1) {
            a /= 10;
            count++;
        }
        int number = b / 100000;
        if ((count == 8) && (number <= 119) && (number >= 115)) {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!\n", args[0]);
        } else {
            System.out.printf("%d",b);

        }
    }

}



