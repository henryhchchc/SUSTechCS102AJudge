public class A1Q5{
    public static void main(String[]args){
        int number;
        for(number =0;number<args.length;++number){
            double price = Double.parseDouble(args[ number]);
            double price1;
            double price2;
            double price3;
            double i;
            price1 = Math.floor(price);
            price2 = Math.floor(price1/10);
            price3 = price-price1;
            i = price-price2*10;
            switch ((int) i) {
                case 2:
                    i = 6;
                    price = i + price2 * 10 + price3;
                    System.out.print(price+" ");
                    break;
                case 4:
                    i = 9;
                    price = i + price2 * 10 + price3;
                    System.out.print(price+" ");
                    break;
                default:
            }


            }

        }

    }

