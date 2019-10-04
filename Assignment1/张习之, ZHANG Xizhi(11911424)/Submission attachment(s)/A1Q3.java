

import java.util.Scanner;
    public class A1Q3 {
        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            float sum=0;
            while(input.hasNext()){
                float price =input.nextFloat();
                float times =input.nextFloat();
                while(times!=0) {
                    if(times==0.5){
                        sum=Math.round(price/2)+1+sum;
                        times=0;
                    }else{
                        sum = sum + price;
                        times--;}
                }}
            System.out.printf("%.1f",sum);
        }}
