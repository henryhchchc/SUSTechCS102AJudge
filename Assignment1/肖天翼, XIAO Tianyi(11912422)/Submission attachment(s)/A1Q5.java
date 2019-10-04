public class A1Q5 {
    public static void main(String[]args){
        int length=args.length;
        int a=0;
        while (true){
            a++;
            if (a>length){
                break;
            }
            else{
                double n=Double.parseDouble(args[(a-1)]);
                int m=(int)Math.floor(n);
                if (m%10==2){
                    System.out.print(n+4+" ");
                }
                if (m%10==4){
                    System.out.print(n+5+" ");
                }
            }
        }
    }
}
