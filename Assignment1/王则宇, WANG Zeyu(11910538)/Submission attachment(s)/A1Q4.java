

public class A1Q4 {
    public static void main(String[] args) {

        int times = 0;
        int CumulativeAmount = 0;
        int SingleAmount = Integer.parseInt(args[0]);
        CumulativeAmount += SingleAmount;
        times++;

        if ((SingleAmount >= 8000) || ((CumulativeAmount >= 5000) && (times >= 10)))
            System.out.println("Diamond");
        else if ((SingleAmount >= 3000) || ((CumulativeAmount >= 2000) && (times >= 5)))
            System.out.println("Gold");
        else if ((SingleAmount >= 1000) || ((CumulativeAmount >= 800) && (times >= 2)))
            System.out.println("Silver");

    }
}