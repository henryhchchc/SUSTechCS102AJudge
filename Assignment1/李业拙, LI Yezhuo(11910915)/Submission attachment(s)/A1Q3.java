import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        float price;
        float copy;
        float total;
        float TOTAL=0;

        Scanner input = new Scanner(System.in);

        do {
            price = input.nextFloat();
            copy = input.nextFloat();

            if (copy%1 >0){
            total = (int)copy*price+(copy%1)*((int)price+1)+1;    }
            else total = copy*price;
            TOTAL +=total;
        }while (input.hasNext());

            System.out.printf("%.1f",TOTAL);

    }
}
