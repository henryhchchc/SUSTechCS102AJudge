public class A1Q4{
    public static void main(String[] args) {
        
        int consumptions=args.length;
        int cumulative_amount=0; 
        int i=0;
        boolean ifd=false;
        boolean ifg=false;
        boolean ifs=false;
        while(i<consumptions){
            int single_value =Integer.parseInt(args[i]);
            cumulative_amount=cumulative_amount+single_value;
            if(single_value>=8000){
            ifd=true;
        }
        else if(single_value>=3000){
            ifg = true;
        }
        else if ((consumptions>=2 && cumulative_amount>=800 )||single_value>=1000){
           ifs = true;
        }
      
           i++;
        }
        if((consumptions>=10 && cumulative_amount>=5000)||ifd){
            System.out.print("Diamond");
        }
        else if((consumptions>=5 && cumulative_amount>=2000)||ifg){
            System.out.print("Gold");
        }
        else if ((consumptions>=2 && cumulative_amount>=800 )||ifs){
           System.out.print("Silver");
        }
        else{
               System.out.println("you are not a vip!");
               
        }
       
        
        
       }
    }

        
        
        
        

        
