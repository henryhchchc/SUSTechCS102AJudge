public class A1Q4 {
    public static void main(String[] args) {
        int money = Integer.parseInt(args[0]);
        int length = args.length;
        int a,b,c;
        a=0;
        c=0;
        for (b=1;b<length;b++){
            a=a+money;
            if(c<money){
                c=money;
            }
            money = Integer.parseInt(args[b]);
        }
        if(((b>=10)&&(a>=5000)) || (c>=8000)){
            System.out.println("Diamond");
        }else if(((b>=5)&&(a>=3000)) || (c>=2000)){
            System.out.println("Gold");
        }else if(((b>=2)&&(a>=800)) || (c>=1000)){
            System.out.println("Sliver");
        }
    }
}
