package javaa;

public class A1Q5 {
    public static void main(String[] args) {
        int n = args.length;
        int i = 0;
        while (i<n){
            float price = Float.parseFloat(args[i]);
            int unit = (int)(price%10);
            if(unit == 2){
                price = price + 4;
                System.out.print(price+" ");
            }
            if(unit == 4){
                price = price + 5;
                System.out.println(price+" ");
            }
            i++;
        }
    }
}
