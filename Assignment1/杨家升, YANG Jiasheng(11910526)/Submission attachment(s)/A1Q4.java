public class A1Q4 {

    public static void main(String[] args) {
        int c=0;
        int d= args.length;
        int[] a=new int[d];
        for(int i = 0;i<d;i++){
            a[i] = Integer.parseInt(args[i]);
            c +=a[i];
        }
        int b = Integer.parseInt(args[0]);
        for(int i=0;i<d;i++){
            if(a[i]>b){
                b=a[i];
            }}
        if((d>=10&&c>=5000)||b>=8000){
            System.out.print("Diamond");
        }else if((d>=5&&c>=2000)||b>=3000){
            System.out.print("Gold");
        }else if((d>=2&&c>=800)||b>=1000){
            System.out.print("Silver");
        }
    }
}
