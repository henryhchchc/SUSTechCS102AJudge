public class A1Q4 {
    public static void main(String[] args){
        int times = args.length;
        int max = 0;
        int sum = 0;
        for (int i = 0;i < times;i++){
            sum = sum + Integer.parseInt(args[i]);
            if (Integer.parseInt(args[i])>max){
                max = Integer.parseInt(args[i]);
            }
        }
        if ((times>=10&&sum>=5000)||(max>=8000)){
            System.out.print("Diamond");
            return;
        }
        if ((times>=5&&sum>=2000)||max>=3000){
            System.out.print("Gold");
            return;
        }
        if ((times>=2&&sum>=800)||max>=1000) {
            System.out.print("Silver");
        }
    }
}
