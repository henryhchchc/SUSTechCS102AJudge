public class A1Q5 {
    public static void main(String[] args) {
        for (String arg : args) {
            double i = Double.parseDouble(arg);
            int a= ((int)i)%10;
        if (a==2)
    System.out.printf("%.1f ", i+4);
else if(a==4)
    System.out.printf("%.1f ", i+5);
        }}}

