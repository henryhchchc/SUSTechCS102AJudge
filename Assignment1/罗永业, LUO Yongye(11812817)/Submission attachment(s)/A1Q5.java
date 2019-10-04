

public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        double b;
        for(int i = 0; i <= length - 1; i++){
            double a = Math.ceil(Double.parseDouble(args[i])) - 1;
            if (a % 10 == 2){

                b =  Double.parseDouble(args[i]) + 4;
                System.out.printf("%.1f ", b);
            }
            else if (a  % 10 == 4) {

                b = Double.parseDouble(args[i]) + 5;
                System.out.printf("%.1f ", b);
            }
        }
    }
}
