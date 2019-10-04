import java.util.Scanner;


public class A1Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0,j=0,k=0;

        while(i<4) {
            int x = sc.nextInt();
            i=i+1;
            k = k+x;
            if(x>=j){
                j = x;






            }

        }
        if((i>=10 && k>=5000) || j>=8000){
            System.out.printf("Diamond");
        }
        else{
            if((i>=5 && k>=2000) || j>=3000){
                System.out.printf("Gold");
            }
            else{
                if((i>=2 && k>= 800) || j>=1000){
                    System.out.printf("Silver");
                }
            }
        }

    }
}
