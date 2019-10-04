import java.util.Scanner;
public class A1Q3 {
    public static void main(String[]args) {
        System.out.println("please enter the prices and pieces respectively\n");
        double i = 0.0,j = 0.0,k = 0.0;

        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            i = in.nextDouble();
            j = in.nextDouble();

            double j1 = j * 2;
            double j2 = j1 % 2;
            if (j2 == 0)
                k = k + i * j;
            else
                k = k + Math.round(i * j) + 1;
        }
        k=k*10;
        k=Math.round(k);
        k=k/10;

        System.out.print(k);
    }
    }
