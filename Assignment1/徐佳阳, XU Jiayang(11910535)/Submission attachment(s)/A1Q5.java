public class A1Q5 {
    public static void main(String[] args){
        int i;
        double price,a,b;
        for (i=0;i<args.length;i++){
          price = Double.parseDouble(args[i]);
          a=Math.floor(price);
          b=a%10;
          if(b==2)
              System.out.print(price+4.0+" ");
          else if(b==4)
              System.out.print(price+5.0+" ");
        }
}}
