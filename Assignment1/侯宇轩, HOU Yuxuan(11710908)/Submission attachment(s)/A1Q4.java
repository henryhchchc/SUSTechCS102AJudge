public class A1Q4 {
    public static void main(String[] args) {
        int q = args.length;
        int sum = 0;
        int p = 0;
        int f1=0;
        int f2=0;
        int f3=0;
        int f4=0;
        for (int i = 0; i <= args.length - 1; i++) {
            sum += Integer.parseInt(args[i]);
        }
        for (int i = 0; i <= args.length - 1; i++) {
            p = Integer.parseInt(args[i]);
            if (p >= 8000||sum>=5000&&q>=10) {
                System.out.printf("Dimond");
                return;
            } else if (p >= 3000||sum>=2000&&q>=5) {
                f1=1;
            } else if (p >= 1000||sum>=800&&q>=2) {
                f2=1;
            }
            f3+=f1;
            f4+=f2;
        }
        if(f3!=0){
            System.out.printf("Gold");
        }
        else if(f4!=0)
            System.out.printf("Sliver");


    }
}




