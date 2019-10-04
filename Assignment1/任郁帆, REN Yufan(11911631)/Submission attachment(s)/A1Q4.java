public class A1Q4 {
    public static void main(String[] args) {
        int a = args.length;
        int i,sum=0,max=0;
        for(i=0;i<a;i++){
            int zqs = Integer.parseInt(args[i]);
            sum += zqs;
            if(max<zqs){
                max = zqs;
            }
        }
        if((a>=10&&sum>=5000)||max>=8000){
            System.out.println("Diamond");
        }
         else if((a>=5&&sum>=2000)||max>=3000){
            System.out.println("Gold");
        }
        else if((a>=2&&sum>=800)||max>=1000){
            System.out.println("Silver");
        }
        }
    }

