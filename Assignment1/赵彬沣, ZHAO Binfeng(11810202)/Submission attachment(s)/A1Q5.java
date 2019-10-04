public class A1Q5 {
    public static void main(String[] args) {
        int i=0;
        int length =args.length;
         int price4,price5;
        while(i<length){
            double price = Double.parseDouble(args[i]);
            int price2 = (int)price;
            double price3 = price-price2;
            double newprice;
            price4=price2%10;
            price5=price2/10;
            if(price4==2){
                price4=6;
                newprice=price5*10+price4+price3;
                System.out.printf("%.1f\t",newprice);
            }
            if(price4==4){
                price4=9;
                newprice=price5*10+price4+price3;
                System.out.printf("%.1f\t",newprice);
            }
            i++;
        }

    }
}
