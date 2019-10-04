import java.util.stream.DoubleStream;

public class A1Q5 {
    public static void main(String[] args) {
        for (String str : args) {

            double price = Double.parseDouble(str);
            double a = price / 10;
            double b = (a - Math.floor(a)) * 10;
            double b1 = b - Math.floor(b);//b1是小数位。
            double c = Math.floor(b);//c是个位。
            double d = ((int) Math.floor(price) / 10) * 10;//d是其他位
            if (c == 2) {
                c = 6;
                price = d + c + b1;
                System.out.printf("%.1f ", price);
            } else if (c == 4) {
                c = 9;

                price = d + c + b1;
                System.out.printf("%.1f ", price);
            } else {
                System.out.print("");
            }


        }
    }
}