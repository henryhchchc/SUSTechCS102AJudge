public class A1Q5 {
    public static void  main(String[] args){
        int a = args.length;
        int i = 0;

        while (i<a) {
            double ai = Double.parseDouble(args[i]);
            double b  = ai%10;
             if(2<=b&&b<3) {
                    ai = ai + 4;
                    System.out.printf("%.1f ", ai); }
            else if(4<=b&&b<5){
                    ai = ai +5;
                    System.out.printf("%.1f ",ai);}
                    else System.out.print("");
            i = i+1;
        }

    }
}
