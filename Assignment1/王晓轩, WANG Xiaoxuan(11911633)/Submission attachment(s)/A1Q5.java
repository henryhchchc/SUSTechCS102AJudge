

public class A1Q5 {
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++) {
            double price = Double.parseDouble(args[i]);
            int u = (int)price % 10;
            if (u == 2){
                price += 4;
                System.out.printf("%.1f ",price);
            }else if(u == 4) {
                price += 5;
                System.out.printf("%.1f ", price);
            }
        }
    }
}
