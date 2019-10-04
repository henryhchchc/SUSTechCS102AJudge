public class A1Q4 {
    public static void  main(String[] args){
        int f = args.length;
        int a = 0;
        int b = 0;
        int i =0;

        while (i<f) {
            int ai = Integer.parseInt(args[i]);
            i = i + 1;
            if (a <= ai)
                a = ai;
            b = b + ai;}
            if ((i >= 10 && a >= 5000) || b>= 8000) {
                System.out.print("Diamond");
            } else if ((i >= 5 && a >= 2000) || b>= 3000) {
                System.out.print("Gold");
            } else if ((i >= 2 && a >= 800) || b >= 1000) {
                System.out.print("Silver");
            } else
                System.out.print("");



    }
}
