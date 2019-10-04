public class A1Q5 {
    public static void main (String[] args){
        int counter=args.length;
        int i=0;
        while(i<counter) {
            double a=Double.parseDouble(args[i]);
            int integer=(int)a;
            int times=integer/10;
            int x=integer%10;
            if(x==2){
                a=a+4;
                System.out.printf("%.1f ",a);

            }else if(x==4){
                a=a+5;
                System.out.printf("%.1f ",a);
            }

                i++;
        }
    }
}
