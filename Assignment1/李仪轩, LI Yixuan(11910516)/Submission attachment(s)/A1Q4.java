public class A1Q4 {
    public static void main(String[] args) {
        int times = args.length;
        int[] amount = new int[times];
        int total = 0;
        int max = Integer.parseInt(args[0]);
        for (int i = 0; i < times; i++) {
            amount[i] = Integer.parseInt(args[i]);
            total += amount[i];
            if (amount[i] > max)
                max = amount[i];
        }
        if ((times >= 10 && total >= 5000) || max >= 8000)
            System.out.print("Diamond");
        else if ((times >= 5 && total >= 2000) || max >= 3000)
            System.out.print("Gold");
        else if ((times >= 2 && total >= 800) || max >= 1000)
            System.out.print("Silver");
    }
}