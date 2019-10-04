public class A1Q5 {
    public static void main(String args[]){
        int i=0;
        int n=args.length;
        double []m;
        m=new double[n];
        for(i=0;i<n;i++){
            m[i]= Double.parseDouble(args[i]);
            m[i]= Math.floor(m[i]);
            if ((Double.parseDouble(String.valueOf(m[i]))+8)%10==0){
                args[i]= String.valueOf(Double.parseDouble(args[i])+4);
                System.out.print(args[i]+" ");
            }else if((Double.parseDouble(String.valueOf(m[i]))+6)%10==0){
                args[i]= String.valueOf(Double.parseDouble(args[i])+5);
                System.out.print(args[i]+" ");
            }

        }


    }

}
