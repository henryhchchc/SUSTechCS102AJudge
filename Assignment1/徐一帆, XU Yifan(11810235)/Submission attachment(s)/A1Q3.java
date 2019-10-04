import java.util.Scanner;
public class A1Q3 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        float sum=0;
        while(input.hasNext()){
            float price = input.nextFloat();
            float count = input.nextFloat();
            int integer=(int)count;
            float decimal = count - integer;
            float a= price / 2 + 1 ;
            int b=(int)a;
            if(a-b>=0.5){
                int cost=b+1;
                float num = (float) (price * integer +cost * decimal / 0.5);
                sum+=num;
                continue;
            }else{
                int cost=b;
                float num = (float) (price * integer +cost * decimal / 0.5);
                sum+=num;
                continue;
            }
        }
        System.out.printf("%.1f",sum);
    }
}

