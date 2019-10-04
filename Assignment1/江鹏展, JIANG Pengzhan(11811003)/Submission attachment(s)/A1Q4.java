
public class A1Q4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int length = args.length;
        int cost[] = new int[length];
        int max = cost[0];
        while(b < args.length) {
            cost[b] = Integer.parseInt(args[b]);
            c += cost[b];
            b++;
        }
        for (int i = 1; i < args.length; i++) {
            if (cost[i] > max) max = cost[i];
        }
            if((b>=10&&c>=5000)||max>=8000){
                System.out.println("Diamond");
            }
            else if((b>=5&&c>=8000)||max>=3000){
                System.out.println("Gold");
            }
            else if((b>=2&&c>=800)||max>=1000){
                System.out.println("Silver");
            }
    }
}
