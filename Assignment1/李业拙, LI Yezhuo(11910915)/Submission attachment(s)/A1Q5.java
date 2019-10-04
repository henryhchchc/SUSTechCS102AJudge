public class A1Q5 {
    public static void main(String[] args){
        int l = args.length;
        double[] k=new double[l];
        int unit;

        for (int i=0;i<l;i++){
            k[i]=Double.parseDouble(args[i]);
            unit=(int)k[i]%10;
            if (unit==2){
                k[i]=k[i]+4;
                System.out.printf(" %.1f",k[i]);}
            else if (unit==4){
                k[i]=k[i]+5;
                System.out.printf(" %.1f",k[i]);
            }


        }

    }
}
