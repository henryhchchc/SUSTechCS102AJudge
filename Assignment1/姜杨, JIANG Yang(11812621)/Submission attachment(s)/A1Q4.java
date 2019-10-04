public class A1Q4 {
    public static void main(String[] args){
        int sum = 0;
        String vip = "null";
        for (String arg : args) {
            int m = Integer.parseInt(arg);
            if (m >= 8000) {
                System.out.print("Diamond");
                System.exit(0);
            }else if (m >= 3000 && !vip.equals("Gold")){
                vip = "Gold";
            }else if (m >= 1000 && vip.equals("null")){
                    vip = "Silver";
            }
            sum += m;
        }

        //Diamond
        if (args.length >= 10 && sum >= 5000){
                System.out.print("Diamond");
                System.exit(0);
        }

        //Gold
        if (vip.equals("Gold") || args.length >= 5 && sum >= 3000){
            System.out.print("Gold");
            System.exit(0);
        }

        //Silver
        if (vip.equals("Silver") || args.length >= 2 && sum >= 800){
            System.out.print("Silver");
        }else {
            System.out.print("Sorry");
        }
    }
}