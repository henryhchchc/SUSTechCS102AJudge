

public class A1Q5 {

    public static void main(String[] args) {
        int length = args.length;
        double[] i = new double[length];
        for(int m = 1;m<=length;m++){
            double a =Double.parseDouble(args[m-1]);
            int b = (int)Math.floor(a);
            int c = b%10;
            if(c==2){
                System.out.print(a+4+"\0");
            }else if(c==4){
                System.out.print(a+5+"\0");
            }


        }

    }
}
