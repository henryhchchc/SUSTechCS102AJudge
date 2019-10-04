

import java.util.Scanner;

public class A1Q4{
    public static void main(String args[]){
        int n1=0;
        int n2 = 0;
        int n3=0;
        int total = 0;
        int m=0;
        for(int i = 0;i<args.length;i++){
            int cost =Integer.parseInt(args[i]);
            if (cost>=8000){
                n1=n1+1;
            }else if (cost<8000&&cost>=3000){
                n2=n2+1;
            }else if(1000<=cost&&cost<3000){
                n3=n3+1;
            }

            m=m+1;
            total=total+cost;


        }if(m>=10&&total>=5000){
            System.out.println("Diamond");
        }else if(total>=8000&&n1>=1){
            System.out.println("Diamond");
        }else if(2000<=total&&m>=5){
            System.out.println("Gold");
        }else if (3000<=total&&total<8000&&n2>=1){
            System.out.println("Gold");
        }else if(800<=total&&m>=2){
            System.out.println("Silver");
        }else if(1000<=total&&total<3000&&n3>=1){
            System.out.println("Silver");
        }else {System.out.println("Sorry,you are not VIP customer");}

    }
}

