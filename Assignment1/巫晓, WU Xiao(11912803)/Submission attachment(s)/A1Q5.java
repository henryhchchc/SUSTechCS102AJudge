public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        double Numn;
        int judge;

        for(int i=0;i<length;i++){
            Numn = Double.parseDouble(args[i]);
            judge = (int) Math.floor(Numn)%10;
            if(judge ==2 || judge ==4) {
                if (judge == 2) {
                    Numn += 4.0;
                } else {
                    if (judge == 4) {
                        Numn += 5.0;
                    }
                }
                System.out.printf("%.1f ",Numn);
            }
        }
    }
}
