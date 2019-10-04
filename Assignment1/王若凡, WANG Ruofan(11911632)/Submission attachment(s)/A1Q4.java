public class A1Q4 {
    public static void main(String[] args) {
        int times=args.length;
        double money=0.0,sum=0.0,max=0.0;
        for(int i=0;i<times;i++){
            money=Double.parseDouble(args[i]);
            sum=sum+money;
            if(max<money){
                max=money;
            }
        }
        if(times>=10&&sum>=5000||max>=8000)
        {
            System.out.println("Diamond");
        }
        else if(times>=5&&sum>=2000||max>=3000)
        {
            System.out.println("Gold");
        }
        else if(times>=2&&sum>=800||max>=1000)
        {
            System.out.println("Silver");
        }
    }
}
