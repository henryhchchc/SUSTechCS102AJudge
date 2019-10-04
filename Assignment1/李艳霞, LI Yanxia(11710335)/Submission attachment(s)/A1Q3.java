public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost = 0;
        while(in.hasNext()) {
            double price = in.nextDouble();
            double piece = in.nextDouble();
            if ((piece*10)%10 != 0) {
                cost = cost + ((price * 10) / 10) * piece + ROUND(0.5 * price, 1) + 1;
            } else {
                cost = cost + price * piece;
            }
        }
        System.out.println(cost);
    }
}
