import java.util.Scanner;
//import the Scanner package
public class A1Q2 {
//start class
    public static void main(String[] args) {
        //start method main
        int a = 0;
        int b;

        Scanner input = new Scanner(System.in);
        for(int n=5;n>=0;n--) {
            a = (int) ((int)Math.pow(-1,n/3)*Math.pow(60, n % 3)*input.nextInt() + a);
            //input 6 numbers, use 3 to divide them into two groups
            //The first group should be subtracted by the second group
            //The numbers in each group represent hours, minutes and seconds
        }
        if(a!=0) {
            if(a/60!=0) {
                System.out.printf("%dm",a/60);
            }
            if(a%60!=0){
                System.out.printf("%ds",a%60);
            }
        }
        else{
            System.out.print("0s");
        }//print final result
    }
}
