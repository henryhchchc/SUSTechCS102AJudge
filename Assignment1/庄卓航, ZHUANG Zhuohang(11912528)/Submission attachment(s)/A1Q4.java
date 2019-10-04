public class A1Q4 {
    public static void main(String[] args) {
        int times = 0;
        int total = 0;
        int max = 0;
        int l=args.length;

        for(int i=0 ;i<l;i++){
            total = total+ Integer.parseInt(args[i]);
            if( max<=Integer.parseInt(args[i]))
                max=Integer.parseInt(args[i]);
            times +=1;
        }
        if( (times>=10 && total>= 5000) || max>=8000 )
            System.out.println("Diamond");
        else if( (times>=5 && total>= 2000) || max>=3000 )
            System.out.println("Gold");
        else if( (times>=2 && total>= 800) || max>=1000 )
            System.out.println("Silver");
    }
}