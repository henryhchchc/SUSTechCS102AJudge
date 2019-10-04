import java.util.Scanner;

public class A1Q3 {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            float money = 0;
            float sum = 0;
            while (in.hasNext()) {
                float price = in.nextFloat();
                float number = in.nextFloat();
                if (number==(int)number) {
                    money = price * number ;
                }
                else
                {
                    money = price * number+1;}
                sum += money;
            }

            System.out.println(sum);


        }
}
