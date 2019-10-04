public class A1Q4 {
    public static void main(String[] args){

        int mon=0;
        int length=args.length;
        int single=0;
        int max=Integer.parseInt(args[0]);

        for(int i=0;i<args.length;i++){
            mon= mon +Integer.parseInt(args[i]);
            if(max <= Integer.parseInt(args[i])){
                max = Integer.parseInt(args[i]);
            }
        }
        if((length>=10 && mon >= 5000)||(max>=8000)){
            System.out.println("Diamond");
        }
        else if ((length>=5 && mon>=2000)||(max>=3000)){
            System.out.println("Gold");
        }
        else if ((length>=2 && mon>=800)||(max>=1000)){
            System.out.println("Silver");
        }
    }
}
