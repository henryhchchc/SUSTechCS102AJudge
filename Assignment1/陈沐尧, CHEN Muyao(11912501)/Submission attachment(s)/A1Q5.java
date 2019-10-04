import java.util.Scanner;
public class A1Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0,j=0;
        float price[] =  new float[7];
        while(j<6){
            Float x = sc.nextFloat();
            price[i]= x;
            i=i+1;
            j=j+1;



        }
        for(i=0;i<6;i++){
            float m = price[i]-price[i]%1;
            m = m % 10;
            if(m == 2){
                price[i]= price[i]+4;
                System.out.printf("%.1f ",price[i]);
            }
            if( m == 4){
                price[i] =price [i] +5;
                System.out.printf("%.1f ",price[i]);
            }
        }


    }
}
