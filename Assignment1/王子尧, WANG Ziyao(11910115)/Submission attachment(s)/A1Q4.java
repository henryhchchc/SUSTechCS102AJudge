public class A1Q4 {
        public static void main(String []args){
            int length=args.length;
            int percai=0;
            int sum=0;
            int max=Integer.parseInt(args[0]);
            for (int a=0;a<length;a++){
                percai=Integer.parseInt(args[a]);
                sum=percai+sum;
                if (max<=Integer.parseInt(args[a]))
                    max=Integer.parseInt(args[a]); }
            if ((sum>=5000&length>=10)|(max>=8000))
                System.out.print("Diamond");
            else if ((sum>=2000&length>=5)|(max>=3000))
                System.out.print("Gold");

            else if ((sum>=800&length>=2)|(max>=1000))
                System.out.print("Silver");




        }
    }
