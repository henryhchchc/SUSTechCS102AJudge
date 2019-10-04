public class A1Q5 {
    public static void main(String[] args) {
        int i;
        for (i=0; i+1 <= args.length; i++){
            double price1 = 0;
            double price = Double.parseDouble(args [i]);
            int unit = (int) Math.floor(price);
            if (unit%10 == 2){
                price1 = price + 4;}
            else if (unit%10 == 4){
                price1 = price + 5;}
            if (price1 != 0){
                System.out.printf("%s ",price1);
            }
        }

    }
}
