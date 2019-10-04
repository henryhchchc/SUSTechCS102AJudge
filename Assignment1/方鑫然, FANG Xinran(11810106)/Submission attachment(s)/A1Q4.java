


public class A1Q4 {
    public static void main (String[] args){
        int time,i;
        int cost= 0;
        int cost1 = 0;
        time = args.length;
        for(i=0;i<args.length;i++){
            cost = cost + Integer.valueOf(args[i]);
        }
        for(i=0;i<args.length;i++){
            if(cost1>=Integer.valueOf(args[i])){
                ;
            }else{cost1=Integer.valueOf(args[i]);}
        }
        if((time>=10&&cost>=5000)||cost1>=8000){
            System.out.print("Diamond VIP");
        }else{
            if((time>=5&&cost>=2000)||cost1>=3000){
                System.out.print("Gold VIP");
            }else{
                if((time>=2&&cost>=800)||cost1>=1000){
                    System.out.print("Silver VIP");
                }else{
                    System.out.print("Null");
                }
            }
        }
    }
}
