public class A1Q4 {
    public static void main(String[] args){
        double a = 0;
        double max = 0;
        double total = 0;
        for(int i=0;i<args.length;i++){
            double consumption = Double.parseDouble(args[i]);
            if(max <= consumption){
                max=consumption;
            }
            total += consumption;
            a++;
        }
        if(max >= 8000 )
            System.out.println("Diamond");
        else if (a >= 10) {
            if (total >= 5000)
                System.out.println("Diamond");
        }else if (max >= 3000)
            System.out.println("Gold");
        else if (a >= 5) {
            if (total >= 2000)
                System.out.println("Gold");
        }else if (max >= 1000)
            System.out.println("Silver");
        else if (a >= 2){
            if (total >= 800)
                System.out.println("Silver");
        }
    }
}
