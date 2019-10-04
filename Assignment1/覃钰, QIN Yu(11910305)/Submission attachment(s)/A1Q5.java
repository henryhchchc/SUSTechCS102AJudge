import static java.lang.Integer.parseInt;

public class A1Q5 {
    public static void main(String a[]){
        int[]args=new int[a.length];
        int i;
        double[] b= new double[a.length];
        for (i=0; i<a.length; i++){
//            System.out.println(a[i]);
            int weizhi1=a[i].indexOf("2");
            int weizhi2=a[i].indexOf("4");
//            System.out.println(weizhi1 +" " +weizhi2);
//            int weizhi=0;
//             double b;
            b[i] = Double.parseDouble(a[i]);
            double c =b[i];
            b[i]=(int)b[i];
            if(weizhi1>=0&&b[i] %10==2){
//                String a1=a[i].replace("2","6");
            System.out.print((c+4.0) +" ");
            }
            if(weizhi2>=0&&b[i]%10==4){
//                String a2=a[i].replace("4","9");
                System.out.print((c+5)+" ");
            }
        }
    }
}
