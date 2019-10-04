public class A1Q5 {
    public static void main(String[] args) {
        double length = args.length;
        for (int i = 0; i < args.length; i++) {
            length = Double.parseDouble(args[i]);
                double a, b;
                a = Math.floor(length);
                b = a % 10;
                if (b == 2){
                    System.out.print(length+4+" ");
                    }
                else if (b == 4){
                    System.out.print(length+5+" ");
                }
                else {
                    System.out.print("");
                }
        }
    }
}
