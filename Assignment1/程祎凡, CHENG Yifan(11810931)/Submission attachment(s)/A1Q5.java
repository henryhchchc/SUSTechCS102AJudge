
public class A1Q5 {
    public static void main(String[] args) {
        int n =0;
        while(n<args.length) {
            double a = Double.parseDouble(args[n]);
            int b = (int)a%10;

            if (b==2||b==4){
                double c = a+2;
                System.out.println(c);
            }
            n++;
        }

    }
}
