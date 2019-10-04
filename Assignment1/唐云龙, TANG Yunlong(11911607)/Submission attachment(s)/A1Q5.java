public class A1Q5{
    public static void main(String[]args) {
          
          int i=0;
          while(i<args.length){
            double price = Double.parseDouble(args[i]);
            boolean worry_money_2 =args[i].contains("2.");
            boolean worry_money_4 =args[i].contains("4.");
          if (worry_money_2){
              
              System.out.printf(args[i].replaceAll("2.","6.")+" "); 
        }
          if (worry_money_4){
            args[0].replaceAll("4.","9.");
            System.out.printf(args[i].replaceAll("4.","9.")+" ");
         }
         i++;
        }
         
        
    }
}
