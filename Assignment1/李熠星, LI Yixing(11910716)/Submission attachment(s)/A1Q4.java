public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int max = 0 ,total = 0;
        int mon;
        int num;
        for( num = 0  ;num < length; num++) {
         mon = Integer.parseInt(args[num]);
         total += mon;
         if (max < mon)
             max = mon;
         num++;}
        if ((length >= 10)&&(total >=5000)||max>=8000)
            System.out.println("Diamond");
        else  if ((length >= 5)&&(total >=2000)||max>=3000)
            System.out.println("Gold");
        else  if ((length >= 2)&&(total >=800)||max>=1000)
            System.out.println("Sliver");
    }
}

