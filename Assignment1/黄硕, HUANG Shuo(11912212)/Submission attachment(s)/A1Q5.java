public class A1Q5 {
    public static void main(String[] args) {
        int a=args.length;
        double b;
        double c;
        int d=0;
        for(int i=0;i<a;i++){
            b=Double.parseDouble(args[i]);
            c=Math.floor(b);
            if((c+18)%10==0){
                b=b+4;
                if(d==0){
                    System.out.print(""+b);
                    d++;
                }
                else{
                System.out.print(" "+b);
                d++;
                }
            }
            else if ((c+6)%10==0){
                b=b+5;
                if(d==0){
                    System.out.print(""+b);
                    d++;
                }
                else{
                    System.out.print(" "+b);
                    d++;
                }
            }
        }
    }
}
