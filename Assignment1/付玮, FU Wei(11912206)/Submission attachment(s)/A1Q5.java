public class A1Q5 {
    public static void main(String[] args){
        double i = 0;
        int counter = args.length;
        int s = 1;
        for(s=1;s<=counter;++s){
            i = Double.parseDouble(args[s-1]);
            if((int)i%10 == 2){
                i = i-2+6;
                System.out.print(i+" ");}
                if ((int)i%10 == 4){
                    i = i-4+9;
                    System.out.print(i+" ");
                }
            }
        }
    }

