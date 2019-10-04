public class A1Q5 {
    public static void main(String[] args){
        int L=args.length-1;
        double P=0;

        for(int I=0;I<=l;I++){
            P=Double.parseDouble(args[I]);
            int P1=(int)P;
            int P2=P1/10;
            int P3=P1-P2*10;

            if(P3==2) {
                double dp = P + 4;
                System.out.printf("%.1f ", dp);
            }

            else if(P3==4) {
                double np = P + 5;
                System.out.printf("%.1f ", np);
            }




        }


    }
}
