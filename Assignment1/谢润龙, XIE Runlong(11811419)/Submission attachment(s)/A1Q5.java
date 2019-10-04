import java.util.Scanner;
public class A1Q5 {
    public static void main(String[] args){
	int i=0;
        while (i<args.length){
            float price = Float.parseFloat(args[i]);
	i++;
            int pric = (int)price;
            float e= price-pric;
            int unit = pric-(pric/10)*10;
            if (unit == 2){
                unit = 6;
                pric = (pric/10)*10+unit;
                price = pric+e;
            System.out.printf("%.1f ",price);
            }
            else if (unit == 4) {
                unit = 9;
            pric = (pric/10)*10+unit;
            price = pric+e;
            System.out.printf("%.1f ",price);
            }
        }
    }
}
