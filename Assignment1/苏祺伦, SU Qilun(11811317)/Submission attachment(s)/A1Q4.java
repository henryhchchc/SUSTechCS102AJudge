
public class A1Q4 {
    public static void main(String[] args) {
        int l = args.length;
        double sum = 0;
        int i;
        for (i = 0; i < l; i++) {
            sum = Double.parseDouble(args[i])+sum;
        }
        if(sum<800||sum==800&&l<2){
            System.out.print("");
        }
        else if( sum<1000&& sum>=800 && l>=2 ||sum>=1000&&sum<2000||sum>=2000&&sum<3000&&l<=4){
           System.out.print("Silver");
        }
        else if (sum>=2000&&sum<3000&&l>4||sum>=3000&&sum<5000||sum>=5000&&sum<8000&&l<=9){
            System.out.print("Gold");
        }
        else if (sum>=5000&&sum<8000&&l>9){
            System.out.print("Diomond");
        }
        else
            System.out.print("Diamond");

    }
}
