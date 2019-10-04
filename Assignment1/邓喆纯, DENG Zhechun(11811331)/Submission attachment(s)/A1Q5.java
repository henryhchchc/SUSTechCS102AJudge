public class A1Q5 {
    public static void main(String[] args) {
      int number = args.length;
        for (int i = 0; i < args.length; i++) {
            float price = Float.parseFloat(args[i]);
            if (Math.floor(price) % 10 == 2) {
                System.out.print(price + 4+" ");
            }
            if (Math.floor(price) % 10 == 4) {
                System.out.print(price + 5+" ");
            }


        }
    }
}