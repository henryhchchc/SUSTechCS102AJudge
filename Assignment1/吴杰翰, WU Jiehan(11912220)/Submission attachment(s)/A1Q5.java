public class A1Q5 {
    public static void main(String[] args) {
        int i=0;
        while (i < args.length) {
            float price = Float.parseFloat(args[i]);
            float copy = Float.parseFloat(args[i]);
            i++;
            while (copy >10){
                copy=copy-10;
            }copy=(int)copy;
            if (copy==2){
                price=price+4;
                System.out.printf("%.1f ",price);
            }else if (copy==4){
                price=price+5;
                System.out.printf("%.1f ",price);
            }

        }
    }
}
