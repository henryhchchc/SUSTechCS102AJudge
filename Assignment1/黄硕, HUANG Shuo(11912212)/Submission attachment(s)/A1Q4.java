public class A1Q4 {
    public static void main(String[] args) {
        int i,a,b,c,d,e;
        b=0;
        c=0;
        d=args.length;
        e=0;
        for(i=0;i<d;i++) {
            a = Integer.parseInt(args[i]);
            b += a;
            c++;
            if (((a >= 1000) || (b >= 800 && c >= 2))&&(e==0))
            {
                e=1;
            }
            if (((a >= 3000) || (b >= 2000 && c >= 5))&&(e==1))
            {
                e=2;
            }
            if (((a >= 8000) || (b >= 5000 && c >= 10))&&(e==2))
            {
                e=3;
            }
        }
        if (e==1){
            System.out.println("Silver");
        }
        else if(e==2){
            System.out.println("Gold");
        }
        else if(e==3){
            System.out.println("Diamond");
        }
    }
}
