public class A1Q5 {
    public static void main(String[] args){
        double [] a=new double [1000];
        int tot=0;double h=0,pri;
        int length=args.length;
        for (int i=0;i<=length-1;i++){
            pri=Double.parseDouble(args[i]);
            h=Math.floor(pri);
            h%=10;
            if (h==2) {tot++;a[tot]=pri+4;}
            if (h==4) {tot++;a[tot]=pri+5;}
        }
        for(int i=1;i<=tot;i++){
            System.out.print(a[i]+" ");
        }
    }
}
