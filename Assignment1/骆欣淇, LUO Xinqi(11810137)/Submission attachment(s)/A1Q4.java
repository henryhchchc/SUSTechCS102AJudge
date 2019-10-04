package javaa;

public class A1Q4 {
    public static void main(String[] args) {

        int n = args.length;
        int i = 0;
        int sum = 0;
        int max = 0;
        while (i<n){
            sum = sum + Integer.parseInt(args[i]);
            if(max<Integer.parseInt(args[i])){
                max = Integer.parseInt(args[i]);
            }
            i++;
        }
        if((n>=10&&sum>=5000)||max >= 8000){
            System.out.println("Diamond");
            return;
        }
        if((n>=5&&sum>=2000)||max >= 3000){
            System.out.println("Gold");
            return;
        }
        if((n>=2&&sum>=800)||max >= 1000){
            System.out.println("Silver");
        }
    }
}
