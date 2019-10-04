public class A1Q4 {
    public static void main(String[] args){
        double total = 0;
        double max = 0;
        for(int i = 0;i < args.length;i++){
            double p = Double.parseDouble(args[i]);
            total += p;
            if (max < p)
                max = p;}
        if(args.length >= 10&&(total>=5000||max>=8000))
            System.out.print("Diamond");
        else if(args.length>=5&&(total>=2000||max>=3000))
            System.out.print("Gold");
        else if(args.length>=2&&(total>=800||max>=1000))
            System.out.print("Silver");
        else
            System.out.print("");
    }
}