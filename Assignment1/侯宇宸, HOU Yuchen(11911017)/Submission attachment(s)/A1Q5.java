public class A1Q5 {

    public static void main(String[] args) {
        int length=args.length;
        double price;double b;
        for (int a=0;a<length;a++) {
            price = Double.parseDouble(args[a]);
            b = Math.floor(price % 10);
            if (b == 2)
            { System.out.print(price + 4);System.out.print("\t");}
            else if (b==4){
                System.out.print(price+5);System.out.print("\t");}
        }
    }
}