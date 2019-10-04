public class A1Q4 {

    public static void main(String[] args) {
        int money;
        int total=0;
        int a=0;
        int v=args.length;
        do {
            money=Integer.parseInt(args[a]);
            a++;
            total+=money;}
        while (a<v);
        if(a+1>=8&&total>=5000)
            System.out.print("Diamond");
        else if (total>=8000)
            System.out.print("Diamond");
        else if (a+1>=5&&total>=2000)
            System.out.print("Gold");
        else if (total>=3000)
            System.out.print("Gold");
        else if (a+1>2&&total>=800)
            System.out.print("Silver");
        else if (total>=1000)
            System.out.print("Silver");
    }
}