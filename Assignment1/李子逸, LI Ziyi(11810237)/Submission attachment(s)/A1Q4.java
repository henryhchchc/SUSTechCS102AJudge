public class A1Q4 {
    public static void main(String[]args){
        int length = args.length;

        int t = 0;
        double total = 0;
        double[]num = new double [args.length];

        while(t<=length-1){
             num[t] = Double.parseDouble(args[t]);
            total += num[t];
            t++;
        }

            if((num[args.length-1]>=8000)||((t>=10)&(total>=5000)))
                System.out.println("Diamond");

            else if (((num[args.length-1]>=3000)&(num[args.length-1]<8000))||((t>=5)&(total>=2000)))
                System.out.println("Gold");

            else if (((num[args.length-1]>=1000)&(num[args.length-1]<3000))||((t>=2)&(total>=800)))
                System.out.println("Silver");






    }

}
