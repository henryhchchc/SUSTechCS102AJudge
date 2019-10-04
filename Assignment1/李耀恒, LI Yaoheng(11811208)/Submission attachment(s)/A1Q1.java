public class A1Q1 {
    public static void main(String[] args){
        int id=Integer.parseInt(args[1]);
         if(id/10000000!=0&&id/100000000==0){
             if(id/100000>=116&&id/100000<=119){
              System.out.print(args[0]+", welcome to SUSTECH Hot Pot Restaurant! ");
             }
             else   System.out.print(id);
         }
         else {
             System.out.print(id);
           }
         }

   }

