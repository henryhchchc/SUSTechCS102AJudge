import java.util.Scanner;
public class A1Q4{
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int n = 0;
        int max1 = 0;
        int max2 = 0;
        while(scan.hasNextInt()){     
            n = scan.nextInt();
            sum += n;
            i++;
                if(n>=1000){
                    max1=1;
                }
                if(n>=3000){
                    max1=2;
                }
                if(n>=8000){
                    max1=3;
                }
            }
        if(sum>=1000&&i>=2){
            max2 = 1;
        }
        if(sum>=2000&&i>=5){
            max2 = 2;
        }
        if(sum>=5000&&i>=10){
            max2 = 3;
        }
        max1 = Math.max(max1,max2);
        switch (max1) {
            case 1:
                System.out.println("Silver");
                break;
            case 2:
                System.out.println("Gold");
                break;
            case 3:
                System.out.println("Diamond");
        }
        scan.close();
    }
    
}