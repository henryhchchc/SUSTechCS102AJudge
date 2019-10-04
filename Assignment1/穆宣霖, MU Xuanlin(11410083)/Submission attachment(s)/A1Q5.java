import java.lang.reflect.Array;
import java.util.ArrayList;

public class A1Q5 {
    public static void main(String[] args) {
        int count = 0;
        int counter = 0;
        int length = args.length;
        double a1;
        double[] arr = new double[9];
        for(count = 0;count<length;++count){
            double a = Double.parseDouble(args[count]);
            a1 = a;

            if((int)a%10 == 2){
                arr[counter] = a1+4;
                counter++;
            }
            if((int)a%10 == 4){
                arr[counter] = a1+5;
                counter++;
            }
        }
        for(double a:arr){
            if(a == 0){
                continue;
            }else  System.out.printf("%.1f ", a);
        }
    }
}
