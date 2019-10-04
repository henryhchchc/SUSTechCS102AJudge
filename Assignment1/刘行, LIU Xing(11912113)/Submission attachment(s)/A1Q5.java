public class A1Q5 {
    public static void main(String[] args){
        for(int i=0;i<args.length;i++){
            double price = Double.parseDouble(args[i]);
            double p=Math.floor(price);
            double u=p%10;
            if(u==2){
                double price2 = price + 4;
                System.out.print(price2+" ");}
            else if(u==4){
                double price3 = price + 5;
                System.out.print(price3+" ");}
            else
                System.out.print("");
        }
    }
}