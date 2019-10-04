public class A1Q5 {
    public static void main(String args[]){
        float[] a = new float[args.length];
        int length = args.length;
        for(int i=0;i<length;i++){
            a[i] = Float.parseFloat(args[i]);

        }
        for(int j =0;j<length;j++){
            int b = (int)a[j];
            int c = b%10;
            if(c==2){
                float outcome = a[j] - c +6;
                System.out.printf("%.1f ",outcome);
            }
            if(c==4){
                float outcome = a[j] - c +9;
                System.out.printf("%.1f ",outcome);
            }
        }
    }
}
