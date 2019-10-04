public class A1Q4 {
    public static void main(String[] args) {
        int Q = args.length;
        int Sum = 0;
        int P = 0;
        int F1=0;
        int F2=0;
        int F3=0;
        int F4=0;
        for (int I = 0; I <= args.length - 1; I++) {
            Sum += Integer.parseInt(args[I]);
        }
        for (int I = 0; I <= args.length - 1; I++) {
            P = Integer.parseInt(args[I]);
            if (P >= 8000||Sum>=5000&&Q>=10) {
                System.out.printf("Dimond");
                return;

            } else if (P >= 3000||Sum>=2000&&Q>=5) {
                F1=1;
            } else if (P>= 1000||Sum>=800&&Q>=2) {
                F2=1;
            }

            F3+=F1;
            F4+=F2;
        }
        if(F3!=0){
            System.out.printf("Gold");
        }

        else if(F4!=0)
            System.out.printf("Sliver");


    }
}




