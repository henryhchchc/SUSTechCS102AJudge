  import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
         double price=0;
        while(sc.hasNext()) {
            double dishes = sc.nextDouble();
            double amount = sc.nextDouble();
              int a= (int)amount;
              int singles =(int)(a*dishes*100+((amount/0.5)%2==0?0:dishes*100/2+100));
             String A = Integer.toString(singles);
             int b = Integer.parseInt(""+A.charAt(A.length()-1));
             if(b>=5){singles=singles+10-b;}
             else singles=singles-b;

             price=singles+price;
        }

        System.out.print(price/100);

    }
}
