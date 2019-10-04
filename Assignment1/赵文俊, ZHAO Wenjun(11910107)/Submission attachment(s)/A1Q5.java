public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        int i = 0;
        double b = 0;
        double c = 0 ;
        while(i<length){
            double price =Double.parseDouble(args[i]);
            i = ++i;
            b = (int)price;
            c = b%10;
            if(c==2){
                price = price+4;
                System.out.printf("%.1f ",price);
            }else if(c==4){
                price = price+5;
                System.out.printf("%.1f ",price);
            }else {
                System.out.print("");
            }


        }

    }

}
