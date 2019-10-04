public class A1Q4 {
    public static void main(String[] args){
        int  a=0,sum=0,tot=0,length=args.length,once=0;
        for (int i=0;i<length;i++){
            a=Integer.parseInt(args[i]);
            once=Math.max(once,a);
            sum+=a;
        }
        if (((sum>=5000)&(tot>=10))||(once>=8000)){
            System.out.println("Diamond");
            return;
        }
        if (((sum>=2000)&(tot>=5))||(once>=3000)){
            System.out.println("Golden");
            return;
        }
        if (((sum>=800)&(tot>=2))||(once>=1000))
           System.out.println("Silver");
    }
}
