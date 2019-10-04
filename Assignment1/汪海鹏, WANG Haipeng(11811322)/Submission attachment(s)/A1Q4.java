public class A1Q4 {
    public static void main(String[] args){
        int s = 0;
        int a = 0, b = 0, c = 0;
        int n = args.length;
        for(int i = 0;i < n;++i){
            int x = Integer.parseInt(args[i]);
            s += x;
            if(x>=8000)
                a++;
            else if(x>=3000)
                b++;
            else if(x>=1000)
                c++;
        }
        if(s >= 5000&&n >= 10||a > 0)
            System.out.println("Diamond");
        else if(s >= 2000&&n >= 5||b > 0)
            System.out.println("Gold");
        else if(s >= 800&&n >= 2||c >0)
            System.out.println("Silver");
    }
}
