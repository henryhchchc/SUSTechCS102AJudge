public class A1Q4 {
    public static void main(String[] args) {
        int total = 0 ;
        int max = 0;
        int a = args.length;
        int i;
        for (i=0; i+1 <= args.length; i++){
            total += Integer.parseInt(args [i]);
            if ( Integer.parseInt(args [i])> max ){
                max = Integer.parseInt(args [i]);} }
        if ((a >= 10)&&(total>=5000))
            System.out.println("Diamond");
        else if (max >= 8000)
            System.out.println("Diamond");
        else if ((a >=5)&&(total >=2000))
            System.out.println("Gold");
        else if (max >= 3000)
            System.out.println("Gold");
        else if ((a >= 2)&&(total >=800))
            System.out.println("Silver");
        else if (max >= 1000)
            System.out.println("Silver");
        }
    }