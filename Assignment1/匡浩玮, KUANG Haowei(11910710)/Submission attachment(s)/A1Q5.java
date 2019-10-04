public class A1Q5 {
    public static void main(String[] args) {
        int i=0;
        int length=args.length;
        while (i<=length-1) {
            double price =Double.parseDouble(args[i]);

            ++i;
            int pricee=(int)price;
            if(pricee%10==2){System.out.print(price+4);System.out.printf(" ");}
            if(pricee%10==4){System.out.print(price+5);System.out.printf(" ");}
        }
    }
}
