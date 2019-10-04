public class A1Q5 {
    public static void main(String[] args) {
        int length = args.length;
        int x=0,z=0;
        float a=0;
        while (x<length) {
            float y = Float.parseFloat(args[x]);
            z=(int)y;
            if(z%10==2)
            {
                a=y+4;
                if(a%1!=0) System.out.printf("%.1f ", a);
                else System.out.printf("%d ",(int)a);
            }
            else if(z%10==4)
            {
                a=y+5;
                if(a%1!=0) System.out.printf("%.1f ", a);
                else System.out.printf("%d ",(int)a);
            }
            x=x+1;
            }
        }
}

