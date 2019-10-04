import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pr,nu,sum = 0,cnt;
        while (input.hasNext()) {
            pr = input.nextDouble();
            nu = input.nextDouble();
            cnt = Math.round((pr * nu) * 10);
            cnt /= 10;
            if (Math.round(nu) != nu) cnt++;
            sum += cnt;
        }
        System.out.printf("%.1f",sum);
    }
}
