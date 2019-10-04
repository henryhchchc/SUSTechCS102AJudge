
public class A1Q4 {
    public static void main(String[] args) {
        int Max =0;
        int total = 0;
        String VIP ="";
        for(int i=0;i<args.length;i++){
            total = total+Integer.parseInt(args[i]);
            if (Integer.parseInt(args[i])>Max) {
                Max = Integer.parseInt(args[i]);
            }
        }
        if ((args.length>=2&&total>=800)||Max>=1000){
            VIP = "Silver";
        }
        if ((args.length>=5&&total>=2000)||Max>=3000){
            VIP = "Gold";
        }
        if ((args.length>=10&&total>=5000)||Max>=8000){
            VIP = "Diamond";
        }
        System.out.println(VIP);
    }
}
