import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        double price, number, multiple,  export = 0;
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            price = in.nextDouble();
            number = in.nextDouble();
            multiple = number / 0.5;
            if (multiple % 2 == 0) {
                export = price * number + export;
            } else {
                double half =  Math.rint(price)*0.5;
                export = price * (number-0.5) +  half + 1 + export;
            }
        }
        export = export * 10;
        export = (int)export;
        export = export/10;
        System.out.println(export);
    }
}