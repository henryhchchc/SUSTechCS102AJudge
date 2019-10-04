import java.util.Scanner;
public class A1Q3 {
    public static void main(String []args) {
        double price,num;
        double general_price=0;
        Scanner in =new Scanner(System.in);
        while(in.hasNext()) {
            price=in.nextDouble();
            num=in.nextDouble();
            if(num-Math.round(num)!=0) {
                general_price+=Math.round(price*num*10)*1.0/10+1;
            }
            else {
                general_price+=price*num;
            }
        }
        System.out.printf("%.1f\n",general_price);
    }
}
