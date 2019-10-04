public class A1Q4 {
    public static void main(String[] args) {
        int i = 0;
        int length = args.length;
        int count=0;
        double sum =0;
        while(i<length) {
            double price = Double.parseDouble(args[i]);
            count++;
            sum+=price;
            i++;
            if(price>=8000){
                System.out.printf("Diamond");
                break;
            }
            if(price>=3000){
                System.out.printf("Gold");
                break;
            }
            if(price>=1000){
                System.out.printf("Silver");
                break;
            }
            if(i==length) {
                if (count >= 10 & sum >= 5000) {
                    System.out.printf("Diamond");
                    break;
                }
                if ( count>= 5 & sum >= 2000) {
                    System.out.printf("Gold");
                    break;
                }
                if (count >= 2 & sum >= 800) {
                    System.out.printf("Silver");
                    break;
                }
            }
        }
    }
}
