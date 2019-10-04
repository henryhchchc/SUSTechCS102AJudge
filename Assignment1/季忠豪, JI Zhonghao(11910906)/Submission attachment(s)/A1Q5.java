public class A1Q5 {
    public static void main(String[] args){
        int length = args.length,now;
        double input;

        for (int i=0; i<length; i++){
            input = Double.parseDouble(args[i]);
            now = (int)input%10;

            if (now == 2){
                input+=4;
                System.out.printf("%.1f ",input);
            }
            else if (now == 4){
                input+=5;
                System.out.printf("%.1f ",input);
            }
        }
    }
}
