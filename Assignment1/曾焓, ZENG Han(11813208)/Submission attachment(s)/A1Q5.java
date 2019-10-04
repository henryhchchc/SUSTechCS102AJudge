import java.lang.String;
public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        double[] price = new double[length];
        int[] integer = new int[length];
        for(int i = 0 ; i < length ; i++) {
            price[i] = Double.valueOf(args[i]);
        }
        for(int i = 0; i < length; i++){
            integer[i] = (int) Math.floor(price[i]);
        }
        int[] unit = new int[length];
      //  int[] tens = new int[length];
        for(int i = 0; i < length; i++){
            unit[i] = integer[i] % 10;
          //  tens[i] = integer[i] / 10;
        }
        for (int i = 0; i < length; i++){
            if(unit[i] == 2){
               // unit[i] = 4;
                price[i] = price[i] + 4;
                System.out.print(price[i] + " ");
            }
            if (unit[i] == 4){
                price[i] = price[i] + 5;
                System.out.print(price[i] + " ");
            }
        }
    }
}
