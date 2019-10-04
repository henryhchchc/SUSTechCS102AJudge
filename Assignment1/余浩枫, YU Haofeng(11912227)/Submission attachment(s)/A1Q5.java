public class A1Q5 {
    public static void main(String[] args) {
        int length = args.length;
        double []k=new double[100];
        double []a=new double[100];
        for (int i=0;i<length;i++){
           a[i]=Double.parseDouble(args[i]);
           k[i]=Math.round(a[i]-1);
           if (k[i]%10==2){
               System.out.print(a[i]+4 +" "); }
           if (k[i]%10==4){
               System.out.print(a[i]+5); }
        }

    }
}
