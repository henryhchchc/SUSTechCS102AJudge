public class A1Q5 {
    public static void main(String[]args){
        double m ,price2 ,n;
        int price1 ,price3;
        int length = args.length;
        for(int i =0;i<length;i++){
            float price = Float.parseFloat(args[i]);
            price1 = (int)price;
            m =price-price1;
            price2 =(double)price1;
            price2 = price2/10;
            price3 = (int)price2;
            n = (int)(price2*10-price3*10);
            if(n ==2){
                price2 = m+6+price3*10;
                System.out.printf("%.1f " ,price2);
            }
            if(n ==4){
                price2 =m+9+price3*10;
                System.out.printf("%.1f " ,price2);
            }
        }
    }
}
