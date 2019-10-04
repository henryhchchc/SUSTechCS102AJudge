

public class A1Q5 {

    public static void main(String[] args) {
        int length = args.length;
        int amount = 0;
        while (amount < length){
            double price = Double.parseDouble(args[amount]);
            amount++;
            int integerPrice = (int)(price);
            if(integerPrice % 10 == 2){
                price += 4;
                System.out.printf("%s ", price);
            }
            if(integerPrice % 10 == 4){
                price += 5;
                System.out.printf("%s ", price);
            }
        }
    }
}
