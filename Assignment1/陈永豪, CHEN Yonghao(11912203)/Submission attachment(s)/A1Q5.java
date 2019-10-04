public class A1Q5 {
    public static void main(String[] args){
        float a;
        int b;
        for(int i=0;i<args.length;i++){
            a=Float.parseFloat(args[i]);
            b=(int)a;
            if(b%10==2){
                a=a+4;
                System.out.printf("%.1f ",a);
            }else if(b%10==4){
                a=a+5;
                System.out.printf("%.1f ",a);
            }
        }

    }
}
