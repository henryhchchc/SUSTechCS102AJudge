import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double []a = new double[100];
        double b = 0;
        int i = 0;
        while(sc.hasNext()) {
            a[i] = sc.nextDouble();
            a[i+1] = sc.nextDouble();
            if (((int) a[i + 1] - a[i + 1]) == 0)
                b = b + Math.round(a[i] * a[i + 1] * 10) / 10.0;
            else
                b = b + Math.round(a[i] * a[i + 1] * 10) / 10.0 + 1;
            i=i+2;
        }
        b = Math.round(b*10)/10.0;
        System.out.print(b);
    }
}
