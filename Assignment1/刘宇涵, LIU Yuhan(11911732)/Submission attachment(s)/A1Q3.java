import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double a,b,cost,sum = 0;
        while (input.hasNext())
        {
            a = input.nextDouble();
            b = input.nextDouble();
            if ((b - (int) b) == 0)
            {
                cost =( a * b );
                sum += cost;
            }
            else
                {
                int c = (int) b;
                cost =(a*c+(Math.round(( a * 0.5 + 1)*10))/10);
                sum += cost;
                }
        }
        System.out.printf("%.1f\n",sum);
    }
}
