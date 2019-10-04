public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        for (int i =0; i<length;i++){
            double m = Double.parseDouble(args[i]);
            double n = Math.floor(Double.parseDouble(args[i]));
            if (n > 10 && n%10==2){
                m+=4;
                System.out.print(m+" ");
            }else if (n>10 && n%10==4){
                m+=5;
                System.out.print(m+" ");
            }else if (n<=10 && n-2==0){
                m+=4;
                System.out.print(m+" ");
            }else if (n<=10 && n-4==0){
                m+=5;
                System.out.print(m+" ");
            }
        }
    }

}
