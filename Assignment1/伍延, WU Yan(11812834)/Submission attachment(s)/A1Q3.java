
import java.util.ArrayList;
import java.util.Scanner;

public class A1Q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> prices = new ArrayList<>();
        Double priceSum = 0.0;
        while (scan.hasNext()) {
            prices.add(scan.nextLine());
        }
        for (String price : prices) {
            //判断是否为整数
            String singlePrice = price.split(" ")[0];
            String num = price.split(" ")[1];
            if (!num.contains(".")) {
                double singlePriceSum = round(Double.parseDouble(singlePrice) * Double.parseDouble(num));
                priceSum += singlePriceSum;
            } else {
                int integerPart = (int) Double.parseDouble(num);
                //计算整数部分的价格单
                Double singlePriceSumIntegerPart = round(Double.parseDouble(singlePrice) * integerPart);
                Double singlePriceSumDecimalPart = round(Double.parseDouble(singlePrice)/2) + 1.0;
                System.out.println(singlePriceSumDecimalPart + singlePriceSumIntegerPart);
                priceSum += singlePriceSumDecimalPart + singlePriceSumIntegerPart;
            }
        }
        priceSum = round(priceSum);
        System.out.println(priceSum);
    }

    public static double round(double a) {
        return (double)Math.round(a*10)/10;
    }
}
