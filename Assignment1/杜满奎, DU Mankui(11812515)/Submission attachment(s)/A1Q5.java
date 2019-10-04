import java.util.Scanner;

public class A1Q5 {
    public static void main(String[] args) {
        float value;
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            value = input.nextInt();
            int a = (int)value * 10 & 100;
            int b = a / 10;
            if (b == 2){
                b = b + 4;
            }
            else if ( b == 4) {
                b = b + 5;
            }
        }
    }
}
