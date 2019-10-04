import java.util.Scanner;
public class A1Q3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] price = new double[20];
        double[] piece = new double[20];//I believe that you won't eat too much.
        double[] sums = new double[20];
        price[0] =in.nextDouble();
        piece[0] = in.nextDouble();
        sums[0] = Math.round(price[0] *piece[0]);
        int i=1;
        double all = sums[0];
        while(in.hasNext()){
            price[i]=in.nextDouble();
            piece[i]=in.nextDouble();
            if ( (int)piece[i] != piece[i]){
                sums[i] = (price[i] *(piece[i]-0.5))+(price[i]*0.5)+1;  
            }
            else{
                sums[i] = price[i] *piece[i];
            }
            all = all+sums[i];
            i++;
        }
        System.out.print(all);
    }
}