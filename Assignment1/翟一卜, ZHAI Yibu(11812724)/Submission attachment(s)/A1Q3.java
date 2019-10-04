import java.math.BigDecimal;
import java.util.Scanner;

class A1Q3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double total = 0.00;
    while(in.hasNext()){
        double p;
        double a;
        double k;
        double money1;
        double sss;



        System.out.print("");
        p = in.nextDouble();

        System.out.print("");
        a = in.nextDouble();

        k = Math.floor(a);

        if (a-k == 0)
            money1 = p*a;
        else money1 = p*a + 1;
        String s1 = String.format("%.1f", money1);
        double s2 = Double.valueOf(s1);



        total += s2;

    }


    System.out.printf("%.1f", total);
    }
}


