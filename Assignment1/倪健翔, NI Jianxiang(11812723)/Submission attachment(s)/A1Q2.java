import java.util.Scanner;

public class A1Q2{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        // System.out.println("Beginning Time:");
        int[] bt = new int[3];
        for (int i = 0;i<3;i++) {
           bt[i] = input.nextInt();
        }
        // System.out.println("Ending Time:");
        int[] et = new int[3];
        for (int i = 0;i<3;i++) {
           et[i] = input.nextInt();
    }
    int a =3600*bt[0]+60*bt[1]+bt[2];
    int b = 3600*et[0]+60*et[1]+et[2];

    int c = b-a;
    
    int d = c%60;
    int e = c/60;
    if(d==0){
        System.out.printf("%dm",e);
    }
    else if(d==0&&e==0){
        System.out.print("0s");
    }
    else{
    System.out.printf("%dm%ds",e,d);}
}
}
