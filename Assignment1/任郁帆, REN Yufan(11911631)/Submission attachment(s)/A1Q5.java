public class A1Q5 {
    public static void main(String args[]){
        double dish;
        int i=0;
        int times=args.length;
        for(;i<times;i++){
            dish = Double.parseDouble(args[i]);
            if((int)dish%10==2){
                dish+=4;
                System.out.printf("%.1f ",dish);
            }
            if((int)dish%10==4){
                dish+=5;
                System.out.printf("%.1f ",dish);
            }
        }
    }
}
