import java.util.Scanner;
public class A1Q5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextDouble()){
            double a = scan.nextDouble();
            double b = Math.floor(a);
            double c = b%10;
            int d = (int)c;
            switch (d) {
                case(2):
                    System.out.print(a+4+" ");
                    break;
                case (4):
                    System.out.println(a+5+" ");
                    break;
                default:
                    break;
            }
        };
        scan.close();
    }
}