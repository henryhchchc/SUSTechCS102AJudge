public class A1Q5 {
    public static void main(String[]args){
        int length = args.length;
        int t = 0;


        double[]num = new double [args.length];
        while (t<=length-1){
            num[t]= Double.parseDouble(args[t]);
            int b = (int)num[t];
            int c = b % 10;
            double newprice1=0;
            double newprice2=0;

            if(c == 2)
            {newprice1 = num[t] + 4;
            System.out.printf("%.1f\t",newprice1);}
            if (c == 4) {   newprice2 = num[t] + 5;
            System.out.printf("%.1f\t",newprice2);}
            t++;}




    }
}
