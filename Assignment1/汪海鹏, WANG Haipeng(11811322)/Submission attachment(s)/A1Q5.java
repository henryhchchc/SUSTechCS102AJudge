public class A1Q5 {
    public static void main(String[] args){
        int n = args.length;
        float a,b,c;
        for(int i = 0;i < n;i++){
            a = Float.parseFloat(args[i]);
            b = a - 4.9f;
            c = a - 2.9f;
            while(b > 0&&c > 0)
                b = b - 10;
                c = c - 10;
        if(b == 0 ){
            a = a + 5;
        System.out.printf("%.1f ",a);
        }
        else if(c == 0){
            a = a + 2;
        System.out.printf("%.1f ",a);
        }
        }
    }

}
