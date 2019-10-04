public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        int max=0;
        for (int i = 0; i < length; i++) {
            if(Integer.parseInt(args[i])>=max)max=Integer.parseInt(args[i]);
        }
        if((length>=10&&sum>=5000)||max>=8000) System.out.println("Diamond");
        else if((length>=5&&sum>=2000)||max>=3000) System.out.println("Gold");
        else if((length>=2&&sum>=800)||max>=1000) System.out.println("Sliver");
        else {
        }

    }
}