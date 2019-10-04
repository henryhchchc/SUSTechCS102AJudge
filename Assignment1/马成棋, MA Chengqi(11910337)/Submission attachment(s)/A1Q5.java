public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        int time = 0;
        while (time < length){
            float price = Float.parseFloat(args [time]);
            time = time + 1;
            int ip = (int) price;
            int unit = ip % 10;
            float newPrice;
            if (unit == 2){
                newPrice = price + 4;
                System.out.printf("%.1f ", newPrice);
                }
            else if(unit == 4){
                newPrice = price + 5;
                System.out.printf("%.1f ", newPrice);
            }
            }
        }
    }
