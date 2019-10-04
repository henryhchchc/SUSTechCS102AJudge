import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double price,number,money;
        money=0;
        while(scan.hasNext()){
            price=scan.nextDouble();
            number=scan.nextDouble();
            if(number%1==0){
                money+=price*number;
            }
            else {
                money+=(number-number%1)*price+(number%1)*price+1;
                if (money%0.1>0.04999){
                    money+=-(money%0.1)+0.1;
                }
                else{
                    money+=0;
                }
            }
        }
        if(money%0.1>0.049999){
            money=money-(money%0.1)+0.1;
        }
        System.out.printf("%.1f",money);
    }
}
