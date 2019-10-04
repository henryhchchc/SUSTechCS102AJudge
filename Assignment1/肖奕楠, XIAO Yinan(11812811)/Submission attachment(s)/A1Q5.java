public class A1Q5 {
    public static void main(String[] args) {
        int i =0,j = args.length;
        int unit;
        for(i = 1;i <=j;i++){
            double price = Double.parseDouble(args[i-1]);
            if(price >= 10){
                unit= (int)price % 10;
            }
            else {
                unit = (int) price;
            }
            if(unit == 2){
                price += 4;
                System.out.print(price+" ");
            }
            else if(unit == 4){
                price += 5;
                System.out.print(price+" ");
            }
        }
    }
}
