import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float b=0;
        while(input.hasNext()){
            float c;
            float price = input.nextFloat();
            float a = input.nextFloat();
            int d =(int)a;
            c=a-d;
            if(c==0){
                b+=Math.round(price*d*10)/10f;
            }else {
                b+=Math.round((price*d+(price/2+1))*10)/10f;
            }
        }
        System.out.printf("%.1f",b);

    }
}