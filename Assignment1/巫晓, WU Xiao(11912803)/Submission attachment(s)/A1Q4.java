public class A1Q4 {
    public static void main(String[] args){
        int times = args.length;
        int sum =0;
        int Maxmoney =0;

        for(int i=0;i < times;i++){
            Maxmoney = Math.max(Maxmoney,Integer.parseInt(args[i]));
            sum += Integer.parseInt(args[i]);
        }

        if((times >=10 &&  sum >=5000) || (Maxmoney >=8000)){
            System.out.printf("Diamond");
        } else {
            if((times >=5 && sum >=2000) || (Maxmoney >=3000)){
                System.out.printf("Gold");
            } else {
                if((times >=2 && sum >=800) || (Maxmoney >=1000))
                System.out.printf("Silver");
            }
        }
    }
}
