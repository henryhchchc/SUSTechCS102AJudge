
public class A1Q5 {
    public static void main(String[] args){
       for(int i=1;i<=args.length;i++){
           float price=Float.parseFloat(args[i-1]);
           float number=price%10-price%1;
           if(number==2){
               float right=price+4;
               System.out.printf("%.1f ",right);
           }else if(number==4){
               float right=price+5;
               System.out.printf("%.1f ",right);
          }
       }
    }
}



