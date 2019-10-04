public class A1Q4 {
    public static void main(String[] args){
        int i=0,l,total=0,max=0;
        l=args.length;
        while(i<l){
            int d=Integer.parseInt(args[i]);
            total+=d;
            max=(max+d)/2+Math.abs(max-d)/2;
            i++;
        }
        if ((l >= 10 &total>=5000)|max>=8000)
        System.out.println("Diamond");
        else if((l>=5&total>=2000)|max>=3000)
            System.out.println("Gold");
        else if((l>=2&total>=800)|max>=1000)
            System.out.println("Silver");
    }
}
