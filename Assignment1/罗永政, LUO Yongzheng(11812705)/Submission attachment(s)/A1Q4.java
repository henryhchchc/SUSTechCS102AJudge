public class A1Q4 {
    public static void main(String[] args){
        int length = args.length;
        double ca = 0;
        double max = 0;

        for (int i = 0;i < args.length;i++){
            double sa = Double.parseDouble(args[i]);
            ca += sa;
            if (sa >= max){
                max = sa;
            }

        }if ((args.length>=10 && ca>=5000)||max>=8000) {
            System.out.print("Diamond");
        }else if ((args.length>=5 && ca>=2000)||max>=3000){
            System.out.print("Gold");
        }else if ((args.length>=2 && ca>=800)||max>=1000){
            System.out.print("Silver");
        }
    }
}
