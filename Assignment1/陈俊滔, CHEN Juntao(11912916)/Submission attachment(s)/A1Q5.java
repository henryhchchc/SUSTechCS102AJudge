public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        for(int i = 0;i < length;i++){
        double price = Double.parseDouble(args [i]);
        int a =(int)price;
        int b = (int)price/10;
            if ((a - 2) / 10.0 == b) {
                price = price + 4;
                System.out.printf( "%.1f",price);
                System.out.print(" ");
            } else if ((a - 4) / 10.0 == b) {
                price = price + 5;
                System.out.printf("%.1f",price);
                System.out.print(" ");
            }
        }
    }
}
