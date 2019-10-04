
public class A1Q5 {
    public static void main(String[] args) {
       for(String arg : args){
            double price = Double.parseDouble(arg);
            double unit = Math.floor(price) % 10;

            if (unit == 2)
                System.out.printf("%.1f",  price + 4);
            else if (unit == 4)
                System.out.printf(" %.1f ",  price + 5);


        }
    }




}
