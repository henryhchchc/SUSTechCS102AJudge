import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sum = 0,sort,xiaoshu,newprice = 0;
        int zhengshu;
        while(input.hasNext()) {
            double price = input.nextDouble(), number = input.nextDouble();
            zhengshu = (int) Math.floor(number);
            xiaoshu = number % 1;
            if(((price/2+1)*100) % 10 == 5){
                newprice = ((int)((price/2+1)*10) + 1) / 10.0;
            }
            if (xiaoshu == 0.5) {
                sort = price * zhengshu + newprice;
            } else sort = price * zhengshu;
            sum += sort;
        }
        sum = (Math.round(sum*10))/10.0;
        System.out.println(sum);
    }
}
