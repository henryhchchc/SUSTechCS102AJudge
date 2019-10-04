public class A1Q5 {
    public static void main(String[] args){
        int n = args.length;
        int i = 0;
        double a;
        double b;
        while(i<=(n-1)){
            double j = Double.parseDouble(args[i]);
            if( Math.floor(j)%10 ==2 ){
                a = j-2+6;
                System.out.print(a+" ");
            }
            else if(Math.floor(j)%10==4){
                b=j-4+9;
                System.out.print(b+" ");
            }
            i++;
        }
    }
}
