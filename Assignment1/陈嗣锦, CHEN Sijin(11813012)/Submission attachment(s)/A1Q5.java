public class A1Q5 {
    public static void main(String[] args) {
        String b = "";
        int c = 0;
        for (int i = 0; i < args.length; i++) {
            double a = Double.parseDouble(args[i]);
            if ((int) a % 10 == 2) {
                a = a + 4;
                if(c == 0) {
                    b = b + a;
                }else{
                    b = b + " " + a;
                }
                c++ ;
            } else if ((int) a % 10 == 4) {
                a = a + 5;
                if(c == 0) {
                    b = b + a;
                }else{
                    b = b + " " + a;
                }
                c++ ;

            }
        }
        System.out.print(b);
    }
}