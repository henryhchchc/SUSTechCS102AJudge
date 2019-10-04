public class A1Q4 {
    public static void main(String[] args) {
        int a = args.length;
        int sum = 0;
        int[] times = new int[a];
        for (int i = 0; i < a; i++) {
            times[i] = Integer.parseInt(args[i]);
            sum += times[i];


        }
        int e=0,f=0,h=0;
        for(int i=0;i<a;i++){
            if(times[i]>=8000)
                e+=1;
            else e=e;
            if(times[i]>=3000)
                f+=1;
            else f=f;

            if (times[i]>=1000)
                h+=1;
            else h=h;
        }
            if (e>0)
                System.out.println("Diamond");
            else if(a>9 & sum>=8000)
                System.out.println("Diamond");
            else if(f>0)
                System.out.println("Gold");
            else if (a>4 & sum>=2000)
                System.out.println("Gold");
            else if (h>0)
                System.out.println("Silver");
            else if(a>1 & sum>=800)
                System.out.println("Silver");
            else System.out.println("common member");


    }
}