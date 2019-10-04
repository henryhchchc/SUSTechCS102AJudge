public class A1Q5 {
    public static void main(String[]args){
        double price=0;
        int gewei=0;
        for(int i=0; i<args.length;i++) {
            price = Double.parseDouble(args[i]);
            gewei = (int) price % 10;

            if (gewei == 2) {
                price += 4;
                System.out.print(price);
            }
            else if (gewei == 4) {
                price += 5;
                System.out.print(" "+price);
            }
        }
        }
}


