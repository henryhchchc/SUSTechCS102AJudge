import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        float t = 0;
        while(in.hasNext()){
            float t1 = 0;
            float price = in.nextFloat();
            float quantity = in.nextFloat();
            float Q = quantity%1;
          if(Q == 0){
              t1= price * quantity;
          }
          else if(Q != 0){
              t1 = (quantity -(float)0.5) * price + (price / 2 + 1);
          }
          t1 = Math.round(t1*10);
          float t2 =t1/10;
            t = t + t2;
        }
        System.out.printf("%.1f\n",t);
        System.out.println("END");
    }
}