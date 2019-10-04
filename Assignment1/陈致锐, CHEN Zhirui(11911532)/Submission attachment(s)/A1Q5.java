public class A1Q5 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            double price = Double.parseDouble(args[i]);
            double integer=Math.floor(price);
            double integer2=Math.floor(integer/10)*10;
            double num=integer-integer2;
            double decimal=price-integer;
            if(num==2){
                price=integer2+6+decimal;
                System.out.print(price+" ");
            }
            else if(num==4){
                price=integer2+9+decimal;
                System.out.print(price+" ");
            }



        }

    }
    }

