public class A1Q5 {
    public static void main(String[] args) {
        int a = args.length;

        double[]t=new double[a];
        int[] times = new int[a];
        for (int i = 0; i < a; i++) {
            t[i]=Double.parseDouble(args[i]);
            times[i] = (int)t[i];
            if (times[i] % 10==2){
                t[i]=t[i]+4;
                System.out.printf("%.1f ",t[i]);}
            else if (times[i]%10==4){
                t[i]+=5;
                System.out.printf("%.1f",t[i]);}
        }




    }
}
