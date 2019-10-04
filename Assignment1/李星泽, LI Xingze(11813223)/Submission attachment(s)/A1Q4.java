
public class A1Q4 {
    public static void main(String[] args){
        int n = 1;
        int sum = 0;
        int cost;
        String vip = "";
        while(n <= args.length){
            cost = Integer.parseInt(args[n-1]);
            sum = sum + cost;
            if(sum >= 5000 && n >= 10 && !vip.equals("Silver") && !vip.equals("Gold")){
                vip ="Diamond";
            }
            if(sum >= 2000 && sum < 5000 && n >= 5 && !vip.equals("Silver")){
                vip = "Gold";
            }
            if(sum >= 800 && sum < 2000 && n >= 2){
                vip = "Silver";
            }
            if(cost >= 8000 && !vip.equals("Silver") && !vip.equals("Gold")){
                vip = "Diamond";
            }
            if(cost < 8000 && cost >= 3000 && !vip.equals("Silver")){
                vip = "Gold";
            }
            if(cost < 3000 && cost >= 1000){
                vip = "Silver";
            }
            n ++;
        }
        System.out.printf("%s",vip);
    }

}
