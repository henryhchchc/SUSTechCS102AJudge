public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        int i;double price;double a;double b;double c;double d;double money;
        for(i=0;i<length;i++) {
            price = Double.parseDouble(args[i]);
            a = price * 10 % 100;
            d = price * 10 - a;
            b = a % 10;
            c = (a - b) / 10;
            if (c == 2) {
                c = 6;
                money = (d + c * 10 + b) / 10;
                System.out.printf("%.1f ", money);
            }
            if (c == 4) {
                c = 9;
                money = (d + c * 10 + b) / 10;
                System.out.printf("%.1f ", money);
            }
        }
    }
}
