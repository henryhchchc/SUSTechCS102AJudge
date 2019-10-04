public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        int i,unit,shi= 0;
        double price = 0;
        for (i = 0;i < length;i++ ){
            price = Double.parseDouble(args[i]);
            unit = (int)price % 10;
            if(unit == 2){
                price += 4;
                System.out.print(price + " ");
            }
            else if(unit == 4){
                price += 5;
                System.out.print(price + " ");
            }
        }
    }
}
