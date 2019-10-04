public class A1Q5 {
    public static void main(String[] args) {
        for (String i : args) {
            double d = Double.parseDouble(i);
            int di = (int) d;
            if (di % 10 == 2) {
                d += 4;
                System.out.print(d + " ");
            } else if (di % 10 == 4) {
                d += 5;
                System.out.println(d + " ");
            }
        }

}
    }

