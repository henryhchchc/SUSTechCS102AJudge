public class A1Q4 {
    public static void main(String[] args) {
        double price;
        int counter = 0;
        double max = 0;
        double totalPrice = 0;
        for (int i = 0; i < args.length; i++) {
            price = Double.parseDouble(args[i]);
            totalPrice = totalPrice + price;
            counter = counter + 1;
            if (max < price) {
                max = price;
            }
        }if((counter>=10&max>=5000)||totalPrice>=8000) {
                System.out.print("Diamond");
            }else if(counter>=5&max>=2000||totalPrice>=3000) {
                System.out.print("Gold");
            }else if((counter>=2&max>=5000)||totalPrice>=8000) {
                System.out.print("Silver");
            }else
                ;
            }

}