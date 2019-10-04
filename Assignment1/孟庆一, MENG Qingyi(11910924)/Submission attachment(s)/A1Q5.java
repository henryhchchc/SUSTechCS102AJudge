public class A1Q5 {

    public static void main(String[] args) {
        int n = args.length;
        int i=1;
        while(i<=n){
            double a;
            double price=Double.parseDouble(args[i-1]);
            int p=(int)price;
            int unit=p-p/10*10;
            i++;
            if(unit==2){
                a = price + 4;
                System.out.printf("%.1f\t",a);
            }
            else if(unit==4){
                a=price+5;
                System.out.printf("%.1f\t",a);
            }
        }
    }}