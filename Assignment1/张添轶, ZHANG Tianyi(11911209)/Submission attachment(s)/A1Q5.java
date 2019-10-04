public class A1Q5 {
    public static void main(String[] args){
        for(int i = 0 ; i<args.length;++i)
        {
            boolean change = false;
            float a = Float.parseFloat(args[i]);
            int b = (int)a;
            int c = b%10;
            if (c==2){
                a += 4;
                change = true;
            }
            if (c==4){
                a += 5;
                change = true;
            }
            if (change) System.out.printf("%.1f ",a);
        }
    }
}
