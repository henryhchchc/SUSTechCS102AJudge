public class A1Q5 {
    public static void main(String[] args) {
        double[] A = new double[args.length];
        int s;
        int y;
        for (int i = 0; i < args.length; i++) {
            A[i] = Double.parseDouble(args[i]);
            s = (int) Math.floor(A[i]);
            y = s%10;
            if (y==2){
                System.out.printf("%s ",A[i]+4);
            }else if (y==4){
                System.out.printf("%s ",A[i]+5);
            }
        }
    }
}
