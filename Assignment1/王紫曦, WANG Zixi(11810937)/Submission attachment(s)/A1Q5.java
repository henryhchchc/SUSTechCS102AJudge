public class A1Q5 {
    public static void main(String[] args) {
        float price;
        for(int i = 0; i<args.length; i++){
            price=Float.parseFloat(args[i]);
            if((int)price%10==2){
                price=price-2+6;
                System.out.printf("%.1f ",price); }
             else if((int)price%10==4){
                price=price-4+9;
                System.out.printf("%.1f ",price); }
            }
        }
    }
