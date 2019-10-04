import java.util.Scanner;
public class A1Q3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        while(scan.hasNextDouble()){
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = Math.floor(b);
            if(b-c==0.5){
                sum += Math.round(a/2) + 1;
            };
            sum += a*c;
        };
        scan.close();
        System.out.println(sum);
    }
}