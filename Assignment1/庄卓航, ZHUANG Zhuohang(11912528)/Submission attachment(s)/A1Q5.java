public class A1Q5 {
    public static void main(String[] args){
        float a;
        int b;
        int c;
        int l=args.length;

        for(int i=0; i<l; i++){
            a = Float.parseFloat(args[i]);
            b = (int)a;
            c = b%10;
            if(c==2){
                a+=4;
                System.out.printf("%.1f ",a);
            }
            else if(c==4){
                a+=5;
                System.out.printf("%.1f ",a);
            }
        }
        }
    }

