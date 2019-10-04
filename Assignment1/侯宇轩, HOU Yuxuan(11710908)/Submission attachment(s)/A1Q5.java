public class A1Q5 {
    public static void main(String[] args){
        int l=args.length-1;
        double p=0;
        for(int i=0;i<=l;i++){
            p=Double.parseDouble(args[i]);
            int p1=(int)p;
            int p2=p1/10;
            int p3=p1-p2*10;
            if(p3==2) {
                double dp = p + 4;
                System.out.printf("%.1f ", dp);
            }
            else if(p3==4) {
                double np = p + 5;
                System.out.printf("%.1f ", np);
            }




        }


    }
}
