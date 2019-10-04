

public class A1Q4 {
    public static void main(String[] args) {
      // int amount=Integer.parseInt(args[0]);
       int length =args.length;int amount;int sum=0,b=0;int m =0;
       for(int i=0;i<length;i++){
         amount=Integer.parseInt(args[i]);
         if(amount >m){
            b=amount;
         }else{
             b=m;
         }
         m=amount;

       sum =amount+sum;
       }
       if((length>9&&sum>=5000)||b>=8000)
           System.out.println("Diamond");
       else if((length>4&&sum>=2000)||b>=3000)
           System.out.println("Gold");
       else if ((length>1&&sum>=800)||b>=1000)
           System.out.println("Silver");

    }
}

