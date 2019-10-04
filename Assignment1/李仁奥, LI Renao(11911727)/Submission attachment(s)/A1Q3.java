import java.util.Scanner;
public class A1Q3 {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        double total=0;
        double price,pieces;
        while(in.hasNext()){
            price=in.nextDouble();
            pieces=in.nextDouble();
            if(pieces>(int)pieces)
                total+=Math.round(price*(pieces-(int)pieces))+1;
            total+=price*(int)pieces;
        }
        System.out.printf("%.1f",total);
    }
}
