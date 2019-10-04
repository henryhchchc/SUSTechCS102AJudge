public class A1Q5 {
    public static void main(String []args){

        for(int count=0;count<=args.length-1;count+=1) {
            double a=Double.parseDouble(args[count]);
            double b=Math.floor(a);

            if (b % 10 == 2)
            {
                a += 4;
                System.out.printf("%.1f ", a);
            } else if (b % 10 == 4) {
                a += 5;
                System.out.printf("%.1f ", a);
            }
        }
    }
}
