public class A1Q5 {

    public static <c> void main(String[] args) {
        int c=args.length;
        int b=0;
        Double[] a=new Double[c];
        for(int i = 0;i<c;i++){
            a[i] =Double.parseDouble(args[i]);
            b = (int) (a[i]%10);

        if(b==2){
            a[i]=a[i]+4;
            System.out.printf(a[i]+" ");
        }else if(b==4){
            a[i]=a[i]+5;
            System.out.printf(a[i]+" ");
        }}
    }
}
