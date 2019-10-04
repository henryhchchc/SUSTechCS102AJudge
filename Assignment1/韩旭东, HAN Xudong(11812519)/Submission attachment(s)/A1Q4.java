public class A1Q4 {
    public static void main(String[] args){
        int n = 0, cost, sum = 0;
        String vip = "";
        while(n < args.length){
            cost = Integer.valueOf(args[n]);
            sum += cost;
            if(cost >= 1000 && cost < 3000 && !vip.equals("Gold") && !vip.equals("Diamond")){
                vip = "Silver";
            }else if(cost >= 3000 && cost < 5000 && !vip.equals("Diamond")){
                vip = "Gold";
            }else if(cost >= 5000){
                vip = "Diamond";
            }
            if(sum >= 800 && n >= 1 && !vip.equals("Gold") && !vip.equals("Diamond")){
                vip = "Silver";
            }
            if(sum >= 2000 && n >= 4 && !vip.equals("Diamond")){
                vip = "Gold";
            }
            if(sum >= 5000 && n >= 9){
                vip = "Diamond";
            }
            n++;
        }
        System.out.printf("%s", vip);
    }
}
