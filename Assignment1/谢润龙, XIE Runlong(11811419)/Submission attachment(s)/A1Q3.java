import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float price, total=0,times,s=0;
        int time;
        while (input.hasNext()){
            price = input.nextFloat();
            times = input.nextFloat();
            time = (int)times/1;
            if (time==times)
                s=0;
            else s=1;
            float temp=10*(price/2);
            int tem=(int)temp/1;
            float p= temp-tem;
            if (p*10>=5)
                temp=tem+1;
            else temp = tem;
            float k=temp/10;
            total = total + price*time + s*(k + 1);
            //s=0;
        }
        System.out.printf("%.1f",total);

    }

}
