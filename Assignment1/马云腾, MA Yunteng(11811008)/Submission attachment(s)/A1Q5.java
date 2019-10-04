public class A1Q5 {
    public static void main(String[]args){

        for (int i=0;i<args.length;i++){
            double  n=Double.valueOf(args[i]);
            int n1=(int)n;
            if((n1%10)==2){
                System.out.printf("%.1f",n+4);
            }
            else if(n1%10==4){
                System.out.printf(" %.1f",n+5);
            }
        }
    }
}
